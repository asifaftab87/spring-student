package org.la.student.noor;
/*	Create a class OrderItems having member variables orderId, productId, quantity. create getters and 
	setters for all member variables. Create object of OrderItems class in other class inside
	 main method and set all member values and print all member values using getters.*/


public class OrderItems {
	private int orderId;
	private int productId;
	private int quantity;

	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int i) {
		orderId=i;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int j) {
		productId=j;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int k) {
		quantity=k;
	}
	public void display() {
	System.out.println("OrderId: "+orderId);
	System.out.println("ProductId: "+ productId);
	System.out.println("Quantity: "+ quantity);
}
	
	
	
	
	
	
}
