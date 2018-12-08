package com.hilltopschool.utils.librarymanagementsystem;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "books")
public class Book {
    @Id
    private String id;
    private String name;
    private String author;
    private String edition;
    private LibraryLocation location;
    private List<String> categories;
    private List<Issuer.Clazz> classes;
    private boolean isAcademic;

    public Book() {
    }

    public Book(String name, String author, String edition, LibraryLocation location, List<String> categories, List<Issuer.Clazz> classes, boolean isAcademic) {
        this.name = name;
        this.author = author;
        this.edition = edition;
        this.location = location;
        this.categories = categories;
        this.classes = classes;
        this.isAcademic = isAcademic;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getEdition() {
        return edition;
    }

    public LibraryLocation getLocation() {
        return location;
    }

    public List<String> getCategories() {
        return categories;
    }

    public List<Issuer.Clazz> getClasses() {
        return classes;
    }

    public boolean isAcademic() {
        return isAcademic;
    }
}
