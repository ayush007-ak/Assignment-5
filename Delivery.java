package com.java.entity;

public class Delivery {

	
	private String deliveryto;
	private String deliveryaddress;
	private int deliverynumber;
	

	public Delivery() {}


	public String getDeliveryto() {
		return deliveryto;
	}


	public void setDeliveryto(String deliveryto) {
		this.deliveryto = deliveryto;
	}


	public String getDeliveryaddress() {
		return deliveryaddress;
	}


	public void setDeliveryaddress(String deliveryaddress) {
		this.deliveryaddress = deliveryaddress;
	}


	public int getDeliverynumber() {
		return deliverynumber;
	}


	public void setDeliverynumber(int deliverynumber) {
		this.deliverynumber = deliverynumber;
	}


	@Override
	public String toString() {
		return "Delivery [deliveryto=" + deliveryto + ", deliveryaddress=" + deliveryaddress + ", deliverynumber="
				+ deliverynumber + "]";
	}
	
	
}
