
package com.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.web.entity.Student;
import com.web.repo.StudentsRepo;

@SpringBootApplication
public class StudentAppApplication implements CommandLineRunner {

    @Autowired
    private StudentsRepo repo;

    public static void main(String[] args) {
        SpringApplication.run(StudentAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        Student s1 = new Student(101, "likhi", "java", 27000.90);
//        Student s2 = new Student(104, "mouni", "spring", 67000.90);
//        Student s3 = new Student(105, "harshu", "spring boot", 45000.90);
//
//        repo.save(s1);
//        repo.save(s2);
//        repo.save(s3);

        System.out.println("Records inserted successfully...");
        
        System.out.println("===========get the one student record=======");
//        Student getOne=repo.findById(101).get();
//        System.out.println(getOne);
        System.out.println("===========get all recprds====");
//        List<Student> getAll=(List<Student>) repo.findAll();
//        System.out.println(getAll);
        
        System.out.println("==========delete student record===");
        repo.deleteById(101);
        System.out.println("deleted....");
        
    }
}
