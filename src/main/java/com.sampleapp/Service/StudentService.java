package com.sampleapp.Service;

import com.sampleapp.Entity.Student;
import com.sampleapp.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Collection<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(int id) {
        return studentRepository.findOneById(id);
    }

    public Student updateStudentById(int id, Student student) {
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

    public void deleteStudentById(int id) {
        studentRepository.deleteOneById(id);
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }
}
