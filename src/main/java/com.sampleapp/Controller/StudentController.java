package com.sampleapp.Controller;

import com.sampleapp.Entity.Student;
import com.sampleapp.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public Collection<Student> getAllStudents() {
        return studentService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Student createStudent(@Valid @RequestBody Student student) {
        return studentService.save(student);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable int id) {
        return Optional
                .ofNullable(studentService.findOneById(id))
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Student> updateStudentById(@PathVariable int id, @Valid @RequestBody Student student) {
        return Optional
                .ofNullable(studentService.findOneById(id))
                .map(s -> studentService.updateOneById(id, student))
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> deleteStudentById(@PathVariable int id) {
        return Optional
                .ofNullable(studentService.findOneById(id))
                .map(student -> {
                    studentService.deleteOneById(id);
                    return ResponseEntity.noContent().build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}
