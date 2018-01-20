package com.sampleapp.Service;

import com.sampleapp.Dao.StudentDao;
import com.sampleapp.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public Collection<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

    public Student getStudentById(int id) {
        return studentDao.getStudentById(id);
    }

    public Student updateStudentById(int id, Student student) {
        return studentDao.updateStudentById(id, student);
    }

    public void deleteStudentById(int id) {
        studentDao.deleteStudentById(id);
    }

    public Student createStudent(Student student) {
        return studentDao.createStudent(student);
    }
}
