package com.raj.nola.student.web.rest;

import com.raj.nola.student.domain.Student;
import com.raj.nola.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    StudentService studentSvc;

    @GetMapping("/students")
    public List<Student> findAllStudents() {
        return studentSvc.findAllStudents();
    }
}
