package org.la.student.noor;

public class OrderItemsMain {

	public static void main(String[] args) {
		OrderItems orderItems= new OrderItems();
		orderItems.setOrderId(10);
		orderItems.setProductId(1234);
		orderItems.setQuantity(100);
		
		//orderItems.display()

		int id= orderItems.getOrderId();
		int productId= orderItems.getProductId();
		int quantity= orderItems.getQuantity();

		System.out.println("Id: "+orderItems.getOrderId());
		System.out.println("ProductId: "+orderItems.getProductId());
		System.out.println("Quantity: "+orderItems.getQuantity());
	}

	}
