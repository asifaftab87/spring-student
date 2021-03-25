package org.la.student.aqsa.ArrayList;

import java.util.*;

public class User {
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
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.email = email;
	}
	
	public static void main(String[] args) {
		ArrayList<User> l = new ArrayList<User>();
		
		User u1 = new User(88,"Amit","1988","amit@gmail.com");
		User u2 = new User(99,"Abhishek","1977","abhishek@gmail.com");
		User u3 = new User(77,"Anand","1968","anand@gmail.com");
		User u4 = new User(66,"Amir","1959","amir@gmail.com");
		
		l.add(u1);
		l.add(u2);
		l.add(u3);
		l.add(u4);
		
		for(int i = 0; i<4;i++) {
			System.out.println(l.get(i).dob+"  "+l.get(i).email+"  "+l.get(i).id+"  "+l.get(i).name);
		}
		//for(User c : l) {
		//	System.out.println(c.getDob()+" "+c.getEmail()+"  "+c.getId()+"  "+c.getName()+" ");
		//}
	}
	

}
