package com.practice.estore.repository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.practice.estore.model.Product;

public interface ProductRepository extends CrudRepository<Product, Serializable> {
	
	public Product findById(String id);
	
//	@Query("select p from product as p where p.id=qParam")
//	public Product findById(@Param("qParam") String id);

	public List<Product> findByName(String name);
	public Product findBySkuId(int sku_id);
	public List<Product> findByPriceLessThan(float p);
	public List<Product> findAll();
}
