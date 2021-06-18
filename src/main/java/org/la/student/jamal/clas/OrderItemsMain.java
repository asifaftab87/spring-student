package org.la.student.jamal.clas;

public class OrderItemsMain {

	public static void main(String[] args) {
		
		OrderItems orderItems= new OrderItems();
		
		orderItems.set(1242, 4573, 5);
		
		orderItems.display();

		
		int oid=orderItems.getOrderId();
		int pid=orderItems.getProductId();
		int q=orderItems.getQuantity();
		System.out.println("orderId: "+oid+" productId:  "+pid+" quantity: "+q);
		
		
	}
	

}
