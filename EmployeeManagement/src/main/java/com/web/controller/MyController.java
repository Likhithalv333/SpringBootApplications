package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.entity.Employee;
import com.web.repo.EmployeeRepo;

@Controller
public class MyController {
	@Autowired
	private EmployeeRepo repo;
	@RequestMapping("/")
	public String homePage() {
		return "home";
	}
	@RequestMapping("/addEmployee")
	public String addEmployyForm() {
		return "addEmployee";
	}
	@RequestMapping("/register")
	public String addEmployeeData(Employee employee,ModelMap model) {
		repo.save(employee);
		return "success";
	}
	@RequestMapping("/viewEmployee")
	public String viewAllEmployees(ModelMap model) {
		model.put("employee", repo.findAll());
		return "viewEmployee";
	}
	@RequestMapping("/delete/{empId}")
	public String deleteEmployee(@PathVariable int empId) {
		repo.deleteById(empId);
		return "redirect:/viewEmployee";
	}
	@RequestMapping("/edit/{empId}")
	public String editForm(@PathVariable int empId,ModelMap model) {
		model.put("command", repo.findById(empId).get());
		return "editEmployee";
	}
	@RequestMapping("/editandSave")
	public String editandSaveEmployee(Employee employee ,ModelMap model) {
		repo.save(employee);
		return "redirect:/viewEmployee";
	}
}
