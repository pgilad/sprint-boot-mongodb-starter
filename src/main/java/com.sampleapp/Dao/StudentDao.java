package com.sampleapp.Dao;

import com.sampleapp.Entity.Student;

import java.util.Collection;

public interface StudentDao {
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    Student updateStudentById(int id, Student student);

    void deleteStudentById(int id);

    Student createStudent(Student student);
}
