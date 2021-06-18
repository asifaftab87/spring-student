package org.la.student.barry.clas.task;

public class Merchants {
	/*
	 * Create a class Merchants having member variables id, merchantName, adminId, countryCode, 
	 * createdAt. create getters and setters for all member variables. Create object of Merchants
	 *  class in other class inside main method and set all member values and print all member 
	 *  values using getters.
	 */
 private int id;
 private String merchantName;
 private int adminId;
 private int countryCode;
 
 public int getId() {
	 return id;
 }
   public void setId(int i) {
	   id=i;
   }
   public int getAdminId() {
		 return adminId;
	 }
	   public void setAdminId(int j) {
		   adminId=j;
	   }
	   public int getCountryCode() {
			 return countryCode;
		 }
		   public void setCountryCode(int k) {
			   countryCode=k;
		   }
		   public String getMerchantName() {
				 return merchantName;
			 }
			   public void setMerchantName(String m) {
				   merchantName=m;
			   }
			   
      		   
}
