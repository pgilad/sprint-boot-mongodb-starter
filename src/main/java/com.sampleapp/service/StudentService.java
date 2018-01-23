package com.sampleapp.service;

import com.sampleapp.entity.Student;
import com.sampleapp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Collection<Student> findAll() {
        return studentRepository.findAll();
    }

    public Student findOneById(int id) {
        return studentRepository.findOneById(id);
    }

    public Student updateOneById(int id, Student student) {
        Student s = studentRepository.findOneById(id);
        if (student.getName() != null) {
            s.setName(student.getName());
        }
        if (student.getCourse() != null) {
            s.setCourse(student.getCourse());
        }
        studentRepository.save(s);
        return s;
    }

    public void deleteOneById(int id) {
        studentRepository.deleteOneById(id);
    }

    public Student save(Student student) {
        long count = studentRepository.count();
        student.setId(count);
        return studentRepository.save(student);
    }
}
