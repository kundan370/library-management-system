package com.hilltopschool.utils.librarymanagementsystem;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssuerRepository extends MongoRepository<Issuer, String> {

    Issuer findFirstByNameIgnoreCase(String name);
}
