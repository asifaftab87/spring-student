package org.la.student.bakil.objects;

public class UsersMain {

	public static void main(String[] args) {

		Users users = new Users ();
		
		users.setId(32327832);
		users.setFirstName("Bakil");
		users.setEmail("allembey-2013@hotmail.com");
		users.setGender("Male");
		users.setDateOfBirth("01/01/1990");
		users.setCountryCode("53100");
		users.setCreatedAt("Created at 04/09/1998");
		
		int id = users.getId();
		String firstName = users.getFirstName();
		String email = users.getEmail();
		String gender =users.getGender();
		String dateOfBirth = users.getdateOfBirth();
		String countryCode = users.getCountryCode();
		String createdAt=users.getCreatedAt();
		
		System.out.println("Id :"+id);
		System.out.println("First name :"+firstName);
		System.out.println("Email :"+email);
		System.out.println("Gender :"+gender);
		System.out.println("Date of birth :"+dateOfBirth);
		System.out.println("Countru code :"+countryCode);
		System.out.println("Created at :"+createdAt);

	}

}
