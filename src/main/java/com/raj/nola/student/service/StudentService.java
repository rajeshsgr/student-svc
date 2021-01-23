package com.raj.nola.student.service;

import com.raj.nola.student.domain.Student;
import com.raj.nola.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> findAllStudents(){

        return studentRepository.findAll();
    }
}
