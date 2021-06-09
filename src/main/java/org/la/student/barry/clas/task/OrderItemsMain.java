package org.la.student.barry.clas.task;

public class OrderItemsMain {
	
	public static void main(String[] args) {
		
		OrderItems orderItems= new OrderItems();
		orderItems.setOrderId(21);
		orderItems.setProductId(8787);
		orderItems.setQuantity(4000);
		
		int id= orderItems.getOrderId();
		int productId= orderItems.getProductId();
		int quantity= orderItems.getQuantity();
		
		System.out.println("Id: "+id);
		System.out.println("ProductId: "+ productId);
		System.out.println("Quantity: "+ quantity+" kg");
	}

}
