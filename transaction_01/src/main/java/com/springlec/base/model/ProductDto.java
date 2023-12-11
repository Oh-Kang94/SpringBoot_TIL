package com.springlec.base.model;

public class ProductDto {
	
	String id;
	String product;
	
	public ProductDto() {
		// TODO Auto-generated constructor stub
	}

	public ProductDto(String id, String product) {
		super();
		this.id = id;
		this.product = product;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}
	
	
}
