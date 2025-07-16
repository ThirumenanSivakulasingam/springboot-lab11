package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "Api/V1/student")

public class Studentcontroller {
    @GetMapping
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        412L,
                        "Thirumenan",
                        "e21412@eng.pdn.ac.lk",
                        23,
                        LocalDate.of(2002, Month.JANUARY, 5)
                )
        );
    }
}
