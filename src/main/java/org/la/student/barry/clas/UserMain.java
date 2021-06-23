package org.la.student.barry.clas;

public class UserMain {

	public static void main(String[] args) {
		
		Address address=new Address();
		address.setDoor("22");
		address.setPostcode("77755");
		address.setCity("serimaya");
		address.setStreet("kuala Street");
		
		User user =new User();
		user.setId(3);
		user.setName("Barry");
		user.setAddress(address);
		display(user);
	}

	public static void display(User user) {
	 String city= user.getAddress().getCity();
		System.out.println("city: "+city);
		
	}

}
