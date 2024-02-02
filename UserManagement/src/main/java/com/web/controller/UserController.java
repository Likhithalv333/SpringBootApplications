package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.entity.Users;
import com.web.repo.UsersRepo;

@Controller
public class UserController {
	@Autowired
	private UsersRepo repo;
	@RequestMapping("/")
	public String homePage() {
		return "home";
	}
@RequestMapping("/addUser")
public String userForm() {
	return "addUser";
	
}
@RequestMapping("/register")
public String addUserDetails(Users users,ModelMap model) {
	repo.save(users);
	return "success";
	
}
@RequestMapping("/viewUser")
public String viewAllUserDetails(ModelMap model) {
	model.put("users", repo.findAll());
	return "viewUser";
}
@RequestMapping("/delete/{id}")
public String deleteUser(@PathVariable int id) {
	repo.deleteById(id);
	return "redirect:/viewUser";
}
@RequestMapping("/edit/{id}")
public String editForm(@PathVariable int id,ModelMap model) {
	model.put("command", repo.findById(id).get());
	return "editUser";
}
@RequestMapping("/editandSave")
public String editandSaveUser(Users users,ModelMap model) {
	repo.save(users);
	return "redirect:/viewUser";
}


}
