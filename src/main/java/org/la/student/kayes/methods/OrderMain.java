package org.la.student.kayes.methods;

public class OrderMain {

	public static void main(String[] args) {
		OrderItems order=new OrderItems();
		order.setId(10);
		order.setProduct(799);
		order.setQuantity(50);
		
		int id=order.getId();
		int pro=order.getProduct();
		int quan=order.getQuantity();
		
		System.out.println("ID  =  "+id);
		System.out.println("PRODUCT ID  = "+pro);
		System.out.println("QUANTITY IN KGs  =  "+quan);
	}

}
