package org.la.student.rasheed.clas;
/*
 * 	Create a class OrderItems having member variables orderId, productId, quantity. 
 * create getters and setters for all member variables. 
		Create object of OrderItems class in other class inside main method and 
		set all member values and print all member values using getters.
 */

public class Order {
	
	
	private int orderId;
	private int productId;
	private String quantity;
	
	
	
	public int getoderId() {
		return orderId;
		
	}
	public int getproductId() {
		return productId;
	}
	public String getquantityId() {
		return quantity;
	}
	
	public void setorderId(int o) {
		orderId = o;
	}
	public void setproductId(int p) {
		productId = p;
	}
	public void setquantity(String q) {
		quantity = q;
	}
	public void display() {
		System.out.println("Oder Id : "+orderId+" Product Id : "+productId+" Quantity : "+quantity);
	}
	
	

}
