package com.sampleapp.Dao;

import com.sampleapp.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDao {

    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>() {
            {
                put(1, new Student(1, "A", "CS"));
                put(2, new Student(1, "B", "CS"));
                put(3, new Student(1, "C", "CS"));

            }
        };
    }

    public Collection<Student> getAllStudents() {
        return students.values();
    }

    public Student getStudentById(int id) {
        return students.get(id);
    }

    public Student updateStudentById(int id, Student student) {
        return students.put(id, student);
    }
}
