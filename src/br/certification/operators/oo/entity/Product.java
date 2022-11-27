package br.certification.operators.oo.entity;

public interface Product {

	int getId();

	String getProductName();
	
	String getCategoryName();
	
	Double getPrice();
	
	void setPrice(Double price);

}
