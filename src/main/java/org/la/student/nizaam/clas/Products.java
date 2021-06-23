package org.la.student.nizaam.clas;

import java.util.Date;

/*
 * Create a class Products having member variables id, merchantId, name, price, status, createdAt. 
		create getters and setters for all member variables. Create object of Products class in other class inside main method and set all member values and print all member values using getters.
 */
public class Products {
	

	private int id,merchantId;
	private String name,status;
	private double price;
	private Date createdAt;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(int merchantId) {
		this.merchantId = merchantId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	
}
