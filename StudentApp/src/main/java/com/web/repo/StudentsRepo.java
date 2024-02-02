package com.web.repo;

import org.springframework.data.repository.CrudRepository;

import com.web.entity.Student;

public interface StudentsRepo extends CrudRepository<Student, Integer> {

}
