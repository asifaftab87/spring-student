package org.la.student.barry.clas.task;

public class Products {
	/*
	 * Create a class Products having member variables id, merchantId, name, price, status, createdAt. 
	 * create getters and setters for all member variables. Create object of Products class in other 
	 * class inside main method and set all member values and print all member values using getters.
	 */
	
	private int id;
	private int merchantId;
	private String name;
	private double price;
	private String status;
	
	public int getId() {
		return id;
	}
	
	public void setId(int i) {
		id=i;
	}
	
	public int getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(int j) {
		merchantId=j;
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name=n;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double d) {
		price=d;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String s) {
		status=s;
	}
}
