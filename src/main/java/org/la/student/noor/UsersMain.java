package org.la.student.noor;

public class UsersMain {

	public static void main(String[] args) {
		Users users= new Users();
		users.setId(1);
		users.setFullName("noor");
		users.setEmail("noor@gmail.com");
		users.setGender("female");
		users.setDateOfBirth("30 march");
		users.setCountryCode(411048);

		int id = users.getId();
		String fullName= users.getFullName();
		String email= users.getEmail();
		String gender= users.getGender();
		String dateOfBirth= users.getDateOfBirth();
		int countryCode= users.getCountryCode();

		System.out.println("Id: "+users.getId());
		System.out.println("FullName: "+users.getFullName());
		System.out.println("Email: "+users.getEmail());
		System.out.println("Gender: "+users.getGender());
		System.out.println("Date Of Birth: "+users.getDateOfBirth());
		System.out.println("Country Code: "+users.getCountryCode());

	}

}
