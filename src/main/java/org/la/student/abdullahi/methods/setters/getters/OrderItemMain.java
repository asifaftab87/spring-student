package org.la.student.abdullahi.methods.setters.getters;

public class OrderItemMain {


 
	public static void main(String[]args) {
		
		OrderItem item = new OrderItem();
		
		item.setOrderId(1);
		item.setProductId("2001");
		item.setQuantity("24");
		
		int OrderId = item.getOrderId();
		String ProductId = item.getProductId();
		String Quantity = item.getQuantity();
		
		System.out.println("Order ID = " +OrderId);
		System.out.println("Product Id = " +ProductId);
		System.out.println("Quantity = "+ Quantity);
		
		
		
		
	}
}