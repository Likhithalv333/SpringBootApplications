package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.entity.Student;
import com.web.repo.StudentRepo;
import com.web.service.StudentServiceImp;


@Controller
public class StudentController {
	@Autowired
	private StudentServiceImp service;
	@RequestMapping("/")
	public String homePage() {
		return "home";
	}
	@RequestMapping("/addStudent")
	public String studentForm() {
		return "addStudent";
	}
	@RequestMapping("/register")
	public String saveMarks(Student student) {
		Student s=service.saveStudent(student);
		return "success";
	}
	@RequestMapping("/viewStudent")
	public String viewAllStudent(ModelMap model) {
		model.put("students", service.getAllStudents());

		return "viewStudent";
	}
	@RequestMapping("/delete/{stdRollNo}")
	public String delete(@PathVariable String stdRollNo) {
		service.deleteStudent(stdRollNo);
		return "redirect:/viewStudent";
	}
	@RequestMapping("/edit/{stdRollNo}")
	public String edit(@PathVariable String stdRollNo ,ModelMap model) {
		model.put("command", service.getStudent(stdRollNo));
		return "editStudent";
	}
	@RequestMapping("/editandSave")
	public String editandSave(Student student) {
		Student edit=service.updateStudent(student);
		return "redirect:/viewStudent";
	}
}
