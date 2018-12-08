package com.hilltopschool.utils.librarymanagementsystem;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends MongoRepository<Book, String> {

    List<Book> findAllByNameContainsIgnoreCase(String name);

}
