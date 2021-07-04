package org.la.student.rasheed.clas;

public class UserMain {
	
	public static void main(String [] args) {
		
		Address address = new Address();
		address.setDoor("22");
		address.setPostcode("700019");
		address.setCity("kolkata");
		address.setStreet("rifle range road");
		
		
		User user = new User();
		user.setId(1);
		user.setName("jain");
		user.setAdress(address);
		
	}
	public static void display(User user) {
		String city = user.getAddress().getCity();
		System.out.println("city: "+city);
	}

}
