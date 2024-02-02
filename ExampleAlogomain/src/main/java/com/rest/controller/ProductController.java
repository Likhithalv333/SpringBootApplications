package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.model.Product;
import com.rest.service.ProductService;
@RestController
public class ProductController {
	@Autowired
	private ProductService productService;
	@PostMapping("/save")
	public String saveRecord(@RequestBody Product product) {
		Product product2=productService.saveRecord(product);
		String msg=null;
		if(product2!=null) {
			msg="data inserted";
		}
		else {
			msg="not inserted..";
		}
		return msg;
	}
	@GetMapping("/getAll")

	public List< Product> get() {
		List<Product> getAll=productService.getAllRecords();
	   	return getAll;
	}
}
