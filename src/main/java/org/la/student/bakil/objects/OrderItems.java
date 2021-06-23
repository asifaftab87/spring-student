package org.la.student.bakil.objects;
/*
 * Create a class OrderItems having member variables orderId, productId, quantity. create getters and 
 * setters for all member variables. Create object of OrderItems class in other class inside main method and 
 * set all member values and print all member values using getters.
 */
public class OrderItems {

	private int orderId;
	private int productId;
	private int quantity;
	
	public void setorderId(int i) {
		orderId=i;
	}
	public int getOrderId() {
		return orderId;
	}
	
	public void setProductId(int p) {
		productId=p;
	}
	public int getProductId() {
		return productId;
	}
	
	public void setQuantity (int q) {
		quantity =q;
	}
	public int getquantity() {
		return quantity;
	}
	
	public void display() {
		System.out.println("Order id :"+ orderId+"Product id :"+productId+"Quantity :"+quantity);
	}
}
