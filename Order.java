package com.java.entity;

import java.util.List;

public class Order {
	
	private int orderid;
	private int ordernumber;
	private String orderby;
	private List<Products> products;
	
	
	public Order() {}


	public int getOrderid() {
		return orderid;
	}


	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}


	public int getOrdernumber() {
		return ordernumber;
	}


	public void setOrdernumber(int ordernumber) {
		this.ordernumber = ordernumber;
	}


	public String getOrderby() {
		return orderby;
	}


	public void setOrderby(String orderby) {
		this.orderby = orderby;
	}


	public List<Products> getProducts() {
		return products;
	}


	public void setProducts(List<Products> products) {
		this.products = products;
	}


	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", ordernumber=" + ordernumber + ", orderby=" + orderby + ", products="
				+ products + "]";
	}
	
	
	

}
