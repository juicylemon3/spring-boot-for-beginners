package com.mananabas.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

/**
 * @author EF-lance
 */

@Service
public class StudentService {

    public List<Student> findAllStudents(){
        return List.of(
                new Student(
                        "Lorenz1",
                        "Pogi",
                        LocalDate.now(),
                        "lorenzigitero@gmail.com",
                        55
                ),
                new Student(
                        "Lem3",
                        "Jabolero",
                        LocalDate.now(),
                        "lorenzigitero@gmail.com",
                        21
                )
        );
    }



}
