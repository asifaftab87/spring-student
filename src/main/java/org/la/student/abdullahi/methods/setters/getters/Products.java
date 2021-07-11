package org.la.student.abdullahi.methods.setters.getters;

public class Products {

	private int Id;
	private String MerchantId;
	private String Name;
	private String Price;
	private String Status;
	private String CreatedAt;


       public void setId(int i) {
    	   Id=i;
       }
       public int getId() {
    	   return Id;
       }    
       
       public void setMerchantId(String m) {
    	   MerchantId=m;
       }
       public String getMerchantId() {
    	   return MerchantId;
       }
       public void setName(String n) {
    	   Name=n;
       }
       public String getName() {
    	   return Name;
       }
       public void setPrice(String p) {
    	   Price=p;
       }
       public String getPrice() {
    	   return Price;
       }
       public void setStatus(String s) {
    	   Status=s;
       }
       public String getStatus() {
    	   return Status;
       }
       public void setCreatedAt(String c) {
    	  CreatedAt=c;
       }
       public String getCreatedAt() {
    	   return CreatedAt;
       }
}