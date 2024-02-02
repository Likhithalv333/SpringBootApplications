package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.model.Mobile;
import com.rest.service.MobileService;

@RestController
public class MobileController {
@Autowired
private MobileService mobileService;
@PostMapping("/save")
public String saveRecord(@RequestBody Mobile  mobile) {
	Mobile mobile2=mobileService.saveRecord(mobile);
	String msg=null;
	if(mobile2!=null) {
		msg="data inserted";
	}
	else {
		msg="data not inserted";
	}
		return msg;	
	
}
@GetMapping("/get/{cid}")
public Mobile getOneRecord(@PathVariable int cid) {
	Mobile mobile=mobileService.getOneRecord(cid);
	return mobile;
}
@GetMapping("/getAll")
public List<Mobile> getAll() {
	List<Mobile> mobiles=mobileService.getAllRecords();
	return mobiles;
}
@DeleteMapping("/delete/{cid}")
public void delete(@PathVariable int cid) {
	mobileService.deleteRecord(cid);
}
@PostMapping("/update/{cid}")
public Mobile update(@RequestBody Mobile mobile,@PathVariable int cid) {
	Mobile mobile2=mobileService.updateRecord(mobile, cid);
	return mobile2;
}
}
