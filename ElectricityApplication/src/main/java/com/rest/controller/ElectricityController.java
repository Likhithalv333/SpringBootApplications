package com.rest.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.model.Electricity;
import com.rest.service.ElectricityService;

@RestController
public class ElectricityController {
@Autowired
private ElectricityService electricityService;
@PostMapping("/save")
public String saveDate(@RequestBody Electricity electricity) {
	Electricity e1=electricityService.saveRecord(electricity);
	String message=null;
	if(e1!=null) {
		message="data saved successfully..";
	}
	else {
		message="data failed";
	}
	return message;
}
@GetMapping("/get/{cid}")
public Electricity getOneRecord(@PathVariable int  cid) {
	Electricity get=electricityService.getOneRecord(cid);
	
	return get;
}
@GetMapping("/getAll")
public List<Electricity> getAllRecords(){
	List<Electricity> getAll=electricityService.getAllRecords();
	return getAll;
}
@DeleteMapping("/delete/{cid}")
public void delete(@PathVariable int cid) {
	electricityService.deleteRcord(cid);
}
@PutMapping("/update/{cid}")
public Electricity update(@RequestBody Electricity electricity,@PathVariable int cid) {
	Electricity update=electricityService.updateRcord(electricity, cid);
	return update;
}

}
