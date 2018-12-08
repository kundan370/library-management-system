package com.hilltopschool.utils.librarymanagementsystem;

public class LibraryLocation {
    private int row;
    private int section;

    public LibraryLocation() {
    }

    public LibraryLocation(int row, int section) {
        this.row = row;
        this.section = section;
    }

    public int getRow() {
        return row;
    }

    public int getSection() {
        return section;
    }
}
