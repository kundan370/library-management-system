package com.hilltopschool.utils.librarymanagementsystem;

public class Feedback {
    private String feedback;
    private String comment;

    public Feedback() {
    }

    public Feedback(String feedback, String comment) {
        this.feedback = feedback;
        this.comment = comment;
    }

    public String getFeedback() {
        return feedback;
    }

    public String getComment() {
        return comment;
    }
}
