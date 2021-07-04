package org.la.student.rasheed.clas;

public class UsersMain {

	public static void main(String[] args) {
		
		Users users = new Users();
		users.setId(899);
		users.setfullName("Abdulraheed Ibrahim");
		users.setgender("Male");
		users.setdateOfBirth("09/03/1991");
		users.setcountryCode(63000);
		users.setcreatedAt("Burger King");
		
		
		int Id = users.getId();
		String fullName =users.getfullName();
		String gender =users.getgender();
		String dateOfBirth =users.getdateOfBirth();
		int countryCode =users.getcountryCode();
		String createdAt =users.getcreatedAt();
		
		
		System.out.println("Id No: "+Id);
		System.out.println("Full Name: "+fullName);
		System.out.println("Gender: "+gender);
		System.out.println("Date Of Birth: "+dateOfBirth);
		System.out.println("Country Code: "+countryCode);
		System.out.println("Created At: "+createdAt);

	}

}
