package org.la.student.bakil.objects;
/*
 * Create a class Merchants having member variables id, merchantName, adminId, countryCode, createdAt. create getters and 
 * setters for all member variables. 
   Create object of Merchants class in other class inside main method and set all member values and print all member values using getters.
 */
public class Merchants {


	private int id;
	private String merchantName;
	private int adminId;
	private String countryCode;
	private String createdAt;
	
	
	// Id

	public void setId(int i) {
		id=i;
	}
	public int getId() {
		return id;
	}
	
	// Merchant Name
	public void setMerchantName(String n) {
		merchantName=n;
	}
	public String getMerchantName() {
		return merchantName;
	}
	
	//Admin Id
	public void setAdminId(int d) {
		adminId=d;
	}
	public int getAdminId() {
		return adminId;
	}
	
	// Country code 
	public void setCountryCode(String c) {
		countryCode=c;
	}
	public String getCountryCode() {
		return countryCode;
	}
	
	// Created at 
	public void setCreatedAt(String t) {
		createdAt=t;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	
	public void display() {
		System.out.println("Id :"+id+"Merchant name :"+merchantName+"Admin Id :"+adminId+"Country code :"+countryCode+"Created at :"+createdAt);
	}



}

