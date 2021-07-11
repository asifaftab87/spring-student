package org.la.student.abdullahi.methods.setters.getters;

public class Merchants {

	private int Id;
	private String MerchantName;
	private String AdminId;
	private String CountryCode;
	private String CreatedAt;


       public void setId(int i) {
    	   Id=i;
       }
       public int getId() {
    	   return Id;
       }    
       
       public void setMerchantName(String m) {
    	   MerchantName=m;
       }
       public String getMerchantName() {
    	   return MerchantName;
       }
       public void setAdminId(String a) {
    	   AdminId=a;
       }
       public String getAdminId() {
    	   return AdminId;
       }
       public void setCountryCode(String c) {
    	   CountryCode=c;
       }
       public String getCountryCode() {
    	   return CountryCode;
       }
       public void setCreatedAt(String x) {
    	   CreatedAt=x;
       }
       public String getCreatedAt() {
    	   return CreatedAt;
       }
}