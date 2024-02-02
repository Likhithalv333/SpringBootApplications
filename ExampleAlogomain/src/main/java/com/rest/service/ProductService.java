package com.rest.service;

import java.util.List;

import com.rest.model.Product;

public interface ProductService {
	public Product saveRecord(Product product);
	public List<Product> getAllRecords();
}
