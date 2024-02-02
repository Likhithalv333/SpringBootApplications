package com.web.service;

import java.util.List;

import com.web.entity.Student;

public interface StudentService {

	public Student saveStudent(	Student student);
	public Student updateStudent(Student student);
	public void deleteStudent(String stdRollNo);
	public Student getStudent(String stdRollNo);
	public List<Student> getAllStudents();
}
