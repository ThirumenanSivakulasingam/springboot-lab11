package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

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
