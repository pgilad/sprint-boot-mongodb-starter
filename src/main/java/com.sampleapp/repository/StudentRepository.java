package com.sampleapp.repository;

import com.sampleapp.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {
    Student findOneById(long id);

    void deleteOneById(long id);
}
