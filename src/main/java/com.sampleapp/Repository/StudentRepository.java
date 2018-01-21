package com.sampleapp.Repository;

import com.sampleapp.Entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {
    Student findOneById(int id);

    void deleteOneById(int id);
}
