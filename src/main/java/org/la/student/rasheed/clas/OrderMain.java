package org.la.student.rasheed.clas;

public class OrderMain {

	public static void main(String[] args) {
		
		Order order = new Order();
		order.setorderId(99990);
		order.setproductId(100);
		order.setquantity(" 20 units");
		
		
		
		int orderId = order.getoderId();
		int productId = order.getproductId();
		String quantity = order.getquantityId();
		
		
		System.out.println("Order ID : "+orderId);
		System.out.println("Product ID : "+productId);
		System.out.println("Quantity: "+quantity);

	}

}
