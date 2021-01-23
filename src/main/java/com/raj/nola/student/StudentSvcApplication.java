package com.raj.nola.student;

import com.raj.nola.student.domain.Student;
import com.raj.nola.student.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StudentSvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentSvcApplication.class, args);
    }

    @Bean
    public CommandLineRunner bookDemo(StudentRepository studentRepository) {
        return (args) -> {

            studentRepository.save(new Student(1, "Denis", "Haar"));
            studentRepository.save(new Student(2, "Steve", "Harvey"));
            studentRepository.save(new Student(3, "Courtney", "Simon"));
            studentRepository.save(new Student(4, "Patty", "Martin"));
            studentRepository.save(new Student(5, "Stephani", "Landry"));
            studentRepository.save(new Student(6, "Jose", "Luis"));
        };
    }

}
