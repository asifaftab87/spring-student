package org.la.student.noor;

public class UserMain {
	public static void main(String[] args) {

		Address address = new Address();
		address.setDoor("55");
		address.setPostcode("411048");
		address.setCity("Pune");
		address.setStreet("Nibm road");

		User user = new User();
		user.setId(1);
		user.setName("shaikh");
		user.setAddress(address);
		display(user);
	}

	public static void display(User user) {
		String city = user.getAddress().getCity();
		System.out.println("city: "+city);

	}
}
