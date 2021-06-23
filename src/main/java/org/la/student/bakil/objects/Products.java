package org.la.student.bakil.objects;
/*
 * Create a class Products having member variables id, merchantId, name, price, status, createdAt. 
 * create getters and setters for all member variables. 
   Create object of Products class in other class inside main method and set all member values and print all member values using getters.
 */
public class Products {

	
	private int id;
	private int merchantId;
	private String name ;
	private String price;
	private String status;
	private String createdAt;
	
	// Id 
	public void setId(int i) {
		id=i;
	}
	public int getId() {
		return id;
	}
	
	// Merchant name 
	public void setMerchantId(int m) {
		merchantId=m;
	}
	public int getMerchantId() {
		return merchantId;
	}
	
	// Name 
	public void setName(String n) {
		name =n;
	}
	public String getName() {
		return name;
	}
	
	// Price 
	public void setPrice(String p) {
		price =p;
	}
	public String getPrice() {
		return price;
	}
	
	// Status
	public void setStatus(String s) {
		status=s;
	}
	public String getStatus() {
		return status;
	}
	
	// Created at 
	public void setCreatedAt(String t) {
		createdAt=t;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	
	public void display() {
		
		System.out.println("Id :"+id + "Merchant id :"+merchantId+"Name :"+name+"Price :"+price+"Status :"+status+"Created at :"+createdAt);
	}
}
