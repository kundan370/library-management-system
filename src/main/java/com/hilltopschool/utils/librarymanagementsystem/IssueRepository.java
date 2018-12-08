package com.hilltopschool.utils.librarymanagementsystem;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IssueRepository extends MongoRepository<Issue, String> {

    Issue findFirstByBookId(String id);

    List<Issue> findAllByIssuerId(String id);

    List<Issue> findAllByBookId(String id);
}
