package org.la.student.bakil.objects;

public class OrderItemsMain {

	public static void main(String[] args) {
		
		
		OrderItems order =new OrderItems();

		order.setorderId(28663);
		order.setProductId(998531);
		order.setQuantity(1200);
		
		int orderId=order.getOrderId();
		int productId=order.getProductId();
		int quantity = order.getquantity();
	
		
		System.out.println("Order id :"+orderId+'\n'+"Product id :"+productId+'\n'+"Quantity :"+quantity);
	}

}
