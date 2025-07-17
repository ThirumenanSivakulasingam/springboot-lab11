package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "Api/V1/student")

public class Studentcontroller {
    private final StudentService studentservice;

    @Autowired
    public Studentcontroller(StudentService studentservice) {
        this.studentservice = studentservice;
    }

    @GetMapping
    public List<Student> getStudents() {
        return studentservice.getStudents();
    }
    @PostMapping
    public void registerNewStudent(@RequestBody Student student){
       studentservice.addNewStudent(student);
    }

    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId) {
        studentservice.deleteStudent(studentId);
    }
}
