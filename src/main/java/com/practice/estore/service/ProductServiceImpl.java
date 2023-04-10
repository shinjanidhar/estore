package com.practice.estore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.practice.estore.model.Product;
import com.practice.estore.repository.ProductRepository;


@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	ProductRepository repo;
	
	@Autowired
	public void setRepo(ProductRepository repo) {
		this.repo = repo;
	}
	
	@Override
	public String addProduct(Product toBeAdded) {
		System.out.println(toBeAdded.getPrice());
		Product added = repo.save(toBeAdded);
		return added.getId();
	}
	
	@Override
	public void removeExisting(String id) {
		Product existing = repo.findById(id);
		
		if(existing.getPrice() < 100000) {
			repo.deleteById(id);
		}else {
			throw new IllegalStateException("Product worth more than 100K, can't just be deleted!");
		}
	}

	@Override
	public Product findById(String id) {
		return repo.findById(id);
	}

	@Override
	public List<Product> findAll() {
		return repo.findAll();
	}

}

