package org.la.student.abdullahi.methods.setters.getters;

public class OrdersMain {

	public static void main(String[]args) {
		
		Orders order = new Orders();
		order.setId(001);
		order.setUserId("ST001");
		order.setStatus("Active");
		order.setCreatedAt("Toronto");
		
		int Id= order.getId();
		String UserId = order.getUserId();
		String Status = order.getStatus();
		String CreatedAt = order.getCreatedAt();
		
		System.out.println("Id = "+Id);
		System.out.println("User Id = "+UserId);
		System.out.println("Status = "+ Status);
		System.out.println("Created At = " +CreatedAt);
		
		
		
	}
}