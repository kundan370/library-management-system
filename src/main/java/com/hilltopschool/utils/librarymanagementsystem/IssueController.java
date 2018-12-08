package com.hilltopschool.utils.librarymanagementsystem;

import org.springframework.web.bind.annotation.*;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/issue")
public class IssueController {
    private IssueRepository issueRepository;

    public IssueController(IssueRepository issueRepository) {
        this.issueRepository = issueRepository;
    }

    @GetMapping("/all")
    public List<Issue> getAll() {
        return this.issueRepository.findAll();
    }

    @PostMapping
    public void insert(@RequestBody Issue issue ) {
        boolean canIssue = true;
        Issue alreadyIssued = this.issueRepository.findFirstByBookId(issue.getBookId());
        if (alreadyIssued != null) {
            canIssue = false;
        }
        List<Issue> studentOverloaded = this.issueRepository.findAllByIssuerId(issue.getIssuerId());
        if (studentOverloaded.size() > 2) {
            canIssue = false;
        }
        if (canIssue)
            this.issueRepository.insert(issue);
    }

    @PutMapping("/return/{id}")
    public void ret(@PathVariable("id") String id, @RequestBody Feedback feedback) {
        Optional<Issue> issue = this.issueRepository.findById(id);
        if (issue.isPresent()) {
            Issue i = issue.get();
            i.setDateOfReturn(LocalDate.now());
            i.setFeedback(feedback);
            if (i.getExpectedDateOfReturn().isBefore(i.getDateOfReturn())) {
                i.setPenalty(Duration.between(i.getDateOfReturn().atStartOfDay(),i.getExpectedDateOfReturn().atStartOfDay()).toDays());
            }
            this.issueRepository.save(i);
        }
    }

    @PutMapping("/approve/{id}")
    public void approve(@PathVariable("id") String id, @RequestBody Issue issue){
        issue.setDateOfIssue(LocalDate.now());
        issue.setExpectedDateOfReturn(issue.getDateOfIssue().plusDays(15));
        issue.setApproved(true);
        issue.setIssuedBy(id);
        this.issueRepository.save(issue);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id) {
        this.issueRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    public Issue getById(@PathVariable("id") String id) {
        Optional<Issue> issue = this.issueRepository.findById(id);
        return issue.orElse(null);
    }

    @GetMapping("/book/{id}")
    public List<Issue> getAllByBookId(@PathVariable String bookId) {
        return this.issueRepository.findAllByBookId(bookId);
    }
}