package com.hilltopschool.utils.librarymanagementsystem;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BooksController {

    private BookRepository bookRepository;

    public BooksController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/all")
    public List<Book> getAll() {
        return this.bookRepository.findAll();
    }

    @PostMapping
    public Book insert(@RequestBody Book book) {
        return this.bookRepository.insert(book);
    }

    @PutMapping
    public void update(@RequestBody Book book) {
        this.bookRepository.save(book);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id) {
        this.bookRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    public Book getById(@PathVariable("id") String id) {
        Optional<Book> book = this.bookRepository.findById(id);
        return book.orElse(null);
    }

    @GetMapping
    public List<Book> getByName(@RequestParam("name") String name) {
        return this.bookRepository.findAllByNameContainsIgnoreCase(name);
    }
}
