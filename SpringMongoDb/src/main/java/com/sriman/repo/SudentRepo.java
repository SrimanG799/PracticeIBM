package com.sriman.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sriman.model.Student;
@Repository
public interface SudentRepo extends MongoRepository<Student, Integer> {

}
