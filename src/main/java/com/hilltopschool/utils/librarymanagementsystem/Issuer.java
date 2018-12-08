package com.hilltopschool.utils.librarymanagementsystem;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "issuer")
public class Issuer {
    @Id
    private String id;
    private String name;
    private Clazz clazz;
    private Section section;
    private Role role;

    public enum Clazz {
        NURSERY,LKG,UKG,ONE,I,II,III,IV,V,VI,VII,VIII,IX,X,XI,XII
    }

    public enum Section {
        A,B,C,D,SCIENCE,COMMERCE
    }

    public enum Role {
        STUDENT, TEACHER, ADMIN
    }

    public Issuer() {
    }

    public Issuer(String name, Clazz clazz, Section section, Role role) {
        this.name = name;
        this.clazz = clazz;
        this.section = section;
        this.role = role;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public Section getSection() {
        return section;
    }

    public Role getRole() {
        return role;
    }
}