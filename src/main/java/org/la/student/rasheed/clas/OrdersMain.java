package org.la.student.rasheed.clas;

public class OrdersMain {

	public static void main(String[] args) {
		
		
		Orders orders = new Orders();
		orders.setId(343);
		orders.setuserId(043);
		orders.setstatus("Waiters");
		orders.setcreatedAt("Mc Donald's");
		
		
		
		
		int Id = orders.getId();
		int userId = orders.getuserId();
		String status = orders.getstatus();
		String  createdAt = orders.getcreatedAt();
		
		
		
		System.out.println("Id : "+Id);
		System.out.println("User Id : "+userId);
		System.out.println("Status: "+status);
		System.out.println("Created At: "+createdAt);
				
		
		}

	}


