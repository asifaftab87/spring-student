package org.la.student.barry.clas.task;

public class UsersMain {

	public static void main(String[] args) {
		Users users= new Users();
		users.setId(4);
		users.setFullName("Muhammed Barry");
		users.setEmail("muhammed@gmail.com");
		users.setGender("Male");
		users.setDateOfBirth("10 june 2000");
		users.setCountryCode(00224);
		
		int id = users.getId();
		String fullName= users.getFullName();
		String email= users.getEmail();
		String gender= users.getGender();
		String dateOfBirth= users.getDateOfBirth();
		int countryCode= users.getCountryCode();
		
		System.out.println("Id: "+id);
		System.out.println("FullName: "+fullName);
		System.out.println("Email: "+ email);
		System.out.println("Gender: "+gender);
		System.out.println("Date Of Birth: "+ dateOfBirth);
		System.out.println("Country Code: "+ countryCode);
		
		
		
		System.out.println(".......end..........");
		
		

	}

}
