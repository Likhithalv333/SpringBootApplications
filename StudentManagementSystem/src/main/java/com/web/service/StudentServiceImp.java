package com.web.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.entity.Student;
import com.web.repo.StudentRepo;
@Service
public class StudentServiceImp implements StudentService {
	@Autowired
	private StudentRepo repo;
	@Override
	public Student saveStudent(Student student) {
		int total=0;
		double percentage=0.0;
		String grade=null;
		String result=null;
		total=student.getHibernate()+student.getSpring()+student.getSpringBoot();
		percentage=(total/3)*100;
		if(percentage>=70) {
			grade="A grade";
			
		}
		else if(percentage>=60 && percentage<69) {
			grade="B grade";
		}
		else if(percentage>=50 && percentage<59) {
			grade="C grade";
		}
		else {
			grade="D grade";
		}
		if(student.getHibernate()>=35 && student.getSpring()>=35 && student.getSpringBoot()>=35) {
			result="pass";
		}
		else {
			result="fail";
		}
		student.setGrade(grade);
		student.setTotal(total);
		student.setPercentage(percentage);
		student.setResult(result);
		Student save=repo.save(student);
		
		return save ;
	}
	@Override
	public List<Student> getAllStudents() {
		List<Student> allStudents=repo.findAll();
		return allStudents;
	}
	

	@Override
	public void deleteStudent(String stdRollNo) {
		repo.deleteById(stdRollNo);

	}
	
	@Override
	public Student updateStudent(Student student) {
		int total=0;
		double percentage=0.0;
		String grade=null;
		String result=null;
		total=student.getHibernate()+student.getSpring()+student.getSpringBoot();
		percentage=(total/3)*100;
		if(percentage>=70) {
			grade="A grade";
			
		}
		else if(percentage>=60 && percentage<69) {
			grade="B grade";
		}
		else if(percentage>=50 && percentage<59) {
			grade="C grade";
		}
		else {
			grade="D grade";
		}
		if(student.getHibernate()>=35 && student.getSpring()>=35 && student.getSpringBoot()>=35) {
			result="pass";
		}
		else {
			result="fail";
		}
		student.setGrade(grade);
		student.setTotal(total);
		student.setPercentage(percentage);
		student.setResult(result);
		Student save=repo.save(student);
		
		return save ;
	}

	@Override
	public Student getStudent(String stdRollNo) {
		Student get=repo.findById(stdRollNo).get();
		return get;
	}

	

	

}
