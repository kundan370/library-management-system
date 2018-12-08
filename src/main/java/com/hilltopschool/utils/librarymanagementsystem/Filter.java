package com.hilltopschool.utils.librarymanagementsystem;

import java.util.List;

public class Filter {
    private List<String> categories;
    private List<String> authors;
    private List<String> edition;
    private List<String> classes;

    public Filter(List<String> categories, List<String> authors, List<String> edition, List<String> classes) {
        this.categories = categories;
        this.authors = authors;
        this.edition = edition;
        this.classes = classes;
    }

    public List<String> getCategories() {
        return categories;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public List<String> getEdition() {
        return edition;
    }

    public List<String> getClasses() {
        return classes;
    }
}
