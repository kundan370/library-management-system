package com.hilltopschool.utils.librarymanagementsystem;

public enum Category {
    GRAMMER("Grammer"),
    LITERATURE("Literature"),
    SOCIAL_SCIENCE("Social Science"),
    SCIENCE("Science"),
    MATHS("Maths"),
    PHYSICS("Physics"),
    CHEMISTRY("Chemistry"),
    BIOLOGY("Biology"),
    HISTORY("History"),
    GEOGRAPHY("Geography"),
    CIVICS("Civics"),
    HINDI("Hindi Language"),
    ENGLISH("English Language"),
    REGIONAL("Regional Language"),
    SHORT_STORY("Short Stories"),
    NOVEL("Novels"),
    ART("Art"),
    PHOTOGRAPHY("Photography"),
    COMPUTERS("Computer Science"),
    EVS("Environmental Studies"),
    GENERAL("General Studies"),
    COMMERCE("Commerce"),
    ACCOUNTS("Accounts"),
    ECONOMICS("Economics"),
    CLASSIC("Classic"),
    ROMANCE("Romance"),
    THRILLER("Thriller"),
    HORROR("Horror"),
    MYSTERY("Mystery");

    String category;

    Category(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}