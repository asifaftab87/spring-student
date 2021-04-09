package org.la.student.tahir.coll;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	/*create a class User having fields id, name, dob, email. Create an array list of User class and
add 5 user objects inside the list.*/
	
	
	private int id;
	private String name, dob, email;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public User(int id, String name, String dob, String email) {
		
		this.name = name;
		this.dob = dob;
		this.email = email;
		this.id = id;
	}
	public static void main(String[] args) {
		
		
	
	// String name, dob, email;
	// int id;
	 
	 List<User> list = new ArrayList<>();
	 
	 User user = new User(80, "Tahir", "25 December 2020", "TAhirdalori1@...");
	 User user1 = new User(90, "Isa", "October 25, 2009", "Isa2@yahoo.com");
	 User user2 = new User(70, "Musa", "September 12, 2008", "Musa@yahoo" );
	 User user3 = new User(20, "Sans", "03 May 2006", "Sans@gmail");
	 
	 
	 list.add(user);
	 list.add(user1);
	 list.add(user2);
	 list.add(user3);
	 
	 for (User l : list ) {
		 
		 System.out.println("Id:"+l.getId()+ " Name:" + l.name+ " DOB:" + l.getDob()+ " Email:" + l.email);
	 }

	 
	 
	 
	 
	 
	 
	
	}

}
