package org.la.student.rasheed.clas;

/*
 * Create a class Attendee having member variables attendeeId, firstName, lastName, phone, email, vip. 
 * create getters and setters for all member variables. 
 * Create object of Attendee class in other class inside main method and 
 * set all member values and print all member values using getters.
 */

public class Attendee {
	
	
	private int attendeeId;
	private String firstName;
	private String lastName;
	private int phone;
	private String email;
	private String vip;
	
	
	
	public int getattendeeId() {
		return attendeeId;
	}
	public String getfirstName() {
		return firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public int phone () {
		return phone;
	}
	public String getemail() {
		return email;
	}
	public String getvip() {
		return vip;
	}
	
	public void setattendeeId(int a) {
		 attendeeId = a;
	}
	public void setfirstName(String f) {
		 firstName = f;
	}
	public void setlastName(String l) {
		 lastName = l;
	}
	public void setphone(int p) {
		 phone = p;
	}
	public void setemail(String e) {
		 email = e;
	}
	public void setvip(String v) {
		 vip = v;
	}
	
	

	
	public void diplay() {
		System.out.println(" Attendee Id : "+attendeeId+" First Name : "+firstName+" Last Name : "+lastName+" Phone : "+phone+" Email : "+email+" vip: "+vip);
	}
		
		
		
	

}
