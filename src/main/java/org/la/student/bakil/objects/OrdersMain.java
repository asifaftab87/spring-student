package org.la.student.bakil.objects;

public class OrdersMain {

	public static void main(String[] args) {

		
		Orders orders=new Orders();
		
		orders.setId(22123);
		orders.setUserId(665283);
		orders.setStatus("In the process");
		orders.setcreatedAt("Monday at 01:30pm");
		
		int id = orders.getId();
		int userId = orders.getUserId();
		String status = orders.getStatus();
		String createdAt= orders.getcreatedAt();
		
		System.out.println("Id :"+id);
		System.out.println("User id  :"+userId);
		System.out.println("Order status :"+status);
		System.out.println("Order created at  :"+createdAt);
	}

}
