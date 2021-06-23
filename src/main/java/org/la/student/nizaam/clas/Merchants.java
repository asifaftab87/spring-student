package org.la.student.nizaam.clas;

import java.util.Date;

/*
 * Create a class Merchants having member variables id, merchantName, adminId, countryCode, createdAt. 
		create getters and setters for all member variables. Create object of Merchants class in other class inside main method and set all member values and print all member values using getters.
 */

public class Merchants {

	private int id,adminId;
	private String merchantName,countrycode;
	private Date createdAt;
	
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
}
