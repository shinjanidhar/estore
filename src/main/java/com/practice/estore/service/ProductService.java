package com.practice.estore.service;

import java.util.List;

import com.practice.estore.model.Product;

public interface ProductService {

	String addProduct(Product toBeAdded);

	void removeExisting(String id);

	Product findById(String id);

	List<Product> findAll();
}
