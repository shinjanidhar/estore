package com.practice.estore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class Product {
	
	@Id
//	@Column(name="product_id")
	@GeneratedValue(strategy = GenerationType.UUID)
	String id;
	
	@NotNull
//	@Column(name="product_sku_id")
	int skuId;
	
	@NotNull
//	@Column(name="product_name")
	String name;

	@NotNull
//	@Column(name="product_price")
	float price;

	@NotNull
//	@Column(name="product_created_on")
//	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
	long createdOn = System.currentTimeMillis();

//	@Column(name="product_modified_on")
//	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
	long modifiedOn = System.currentTimeMillis();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getSkuId() {
		return skuId;
	}

	public void setSkuId(int skuId) {
		this.skuId = skuId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public long getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(long createdOn) {
		this.createdOn = createdOn;
	}

	public long getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(long modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", skuId=" + skuId + ", name=" + name + ", price=" + price + ", createdOn="
				+ createdOn + ", modifiedOn=" + modifiedOn + "]";
	}	
	
}
