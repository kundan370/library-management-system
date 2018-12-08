package com.hilltopschool.utils.librarymanagementsystem;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "issues")
public class Issue {
    @Id
    private String id;
    private String bookId;
    private String issuerId;
    private LocalDate dateOfRequestGenerated;
    private LocalDate dateOfIssue;
    private LocalDate expectedDateOfReturn;
    private LocalDate dateOfReturn;
    private long penalty;
    private String issuedBy;
    private boolean approved;
    private Feedback feedback;

    public Issue() {
        this.dateOfRequestGenerated = LocalDate.now();
        this.approved = false;
    }

    public Issue(String bookId, String issuerId) {
        this.bookId = bookId;
        this.issuerId = issuerId;
        this.dateOfIssue = LocalDate.now();
        this.expectedDateOfReturn = this.dateOfIssue.plusDays(15);
    }

    public String getId() {
        return id;
    }

    public String getBookId() {
        return bookId;
    }

    public String getIssuerId() {
        return issuerId;
    }

    public LocalDate getDateOfIssue() {
        return dateOfIssue;
    }

    public LocalDate getExpectedDateOfReturn() {
        return expectedDateOfReturn;
    }

    public LocalDate getDateOfReturn() {
        return dateOfReturn;
    }

    public long getPenalty() {
        return penalty;
    }

//    public String getIssuer() {
//        return issuer;
//    }

    public Feedback getFeedback() {
        return feedback;
    }

    public void setDateOfReturn(LocalDate dateOfReturn) {
        this.dateOfReturn = dateOfReturn;
    }

    public void setPenalty(long penalty) {
        this.penalty = penalty;
    }

    public void setFeedback(Feedback feedback) {
        this.feedback = feedback;
    }

    public void setDateOfIssue(LocalDate dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public void setExpectedDateOfReturn(LocalDate expectedDateOfReturn) {
        this.expectedDateOfReturn = expectedDateOfReturn;
    }

    public String getIssuedBy() {
        return issuedBy;
    }

    public void setIssuedBy(String issuedBy) {
        this.issuedBy = issuedBy;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public LocalDate getDateOfRequestGenerated() {
        return dateOfRequestGenerated;
    }
}