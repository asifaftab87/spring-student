package org.la.student.abdullahi.methods.setters.getters;

public class OrderItem {

	private int OrderId;
	private String ProductId;
	private String Quantity;


       public int getOrderId()
       {
	return OrderId;
} 
       public String getProductId() {
    	   
    	   return ProductId;
       }
      
       
       public void setOrderId(int o) {
    	   OrderId=o;
       }
       
       public void setProductId(String p) {
    	   ProductId=p;
       }
       
       public void setQuantity(String q) {
    	   
    	   Quantity= q;
       }
       public String getQuantity() {
    	   
    	   return Quantity;
       }
    
}