package com.java.entity;

import java.util.List;

public class Products {
	private int productid;
	private String productname;
	private String productdescription;
	private String price;
	private List<Order> order;
	
	
	
	public Products() {}
	
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductdescription() {
		return productdescription;
	}
	@Override
	public String toString() {
		return "Products [productid=" + productid + ", productname=" + productname + ", productdescription="
				+ productdescription + ", order=" + order + "]";
	}
	public void setProductdescription(String productdescription) {
		this.productdescription = productdescription;
	}
	public List<Order> getOrder() {
		return order;
	}
	public void setOrder(List<Order> order) {
		this.order = order;
	}

}
