package br.certification.operators.oo.entity.impl;

import br.certification.operators.oo.entity.Product;

public class DefaultProduct implements Product {
	
	private int id;
	private String productName;
	private String categoryName;
	

	private double price;

	public DefaultProduct() {
	}
	
	public DefaultProduct(int id, String productName, String categoryName, double price) {
		this.id = id;
		this.productName = productName;
		this.categoryName = categoryName;
		this.price = price;
	}
	

	@Override
	public String toString() {
		return "Product id=" + id + ", product name=" + productName
				+ ", category name=" + categoryName + ", price=" + price;
	}

	@Override
	public int getId() {
		return this.id;
	}

	@Override
	public String getProductName() {
		return this.productName;
	}

	@Override
	public String getCategoryName() {
		// TODO Auto-generated method stub
		return this.categoryName;
	}

	@Override
	public Double getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}


	@Override
	public void setPrice(Double price) {
		this.price = price;
		
	}

	
}
