package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args ->{
                    Student thirumenan = new Student(
                            "Thirumenan",
                            "e21412@eng.pdn.ac.lk",
                            LocalDate.of(2002, Month.JANUARY, 5)
                    );

                    Student tithurshan = new Student(
                            "Tithurshan",
                            "e21413@eng.pdn.ac.lk",
                            LocalDate.of(1985, Month.DECEMBER, 28)
                    );

                    repository.saveAll(List.of(thirumenan, tithurshan));
            };
        };
    }
