package org.la.student.barry.clas.task;

public class OrdersMain {

	public static void main(String[] args) {
		Orders orders= new Orders();
		orders.setId(99);
		orders.setUserId(2345);
		orders.setStatus("exc. image");
		
		int id= orders.getId();
		int userId=orders.getUserId();
		String status= orders.getStatus();
	
		
		System.out.println("Id: "+id);
		System.out.println("UserId: "+userId);
		System.out.println("Status: "+status);
		

	}

}
