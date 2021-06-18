package org.la.student.jamal.clas;
/*
 * 4.	Create a class Attendee having member variables attendeeId, firstName, lastName, phone, email, vip. 
 * create getters and setters for all member variables. Create object of Attendee class in other 
 * class inside main method and set all member values and print all member values using getters.
 */

public class Attendee {
	
	private int attendeeId ;
	private String firstName;
	private String lastName;
	private int phone;
	private String email;
	private String vip;
	
	
	
	
	
	
	public int getAttendeeId() {
		return attendeeId;
		
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	
	public int getPhone() {
		return phone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getVip() {
		return vip;
	}
	
	
	
	public void setAttendeeId(int id) {
		attendeeId=id;
		
	}
	
	public void setFirstName(String fn) {
		firstName=fn ;
		
	}
	
	public void setLastName(String ln) {
		lastName=ln;
		
	}
	
	public void setPhone(int p) {
		phone=p;
		
	}
	
	public void setEmail(String e) {
		email=e;
		
	}
	
	public void setVip (String v) {
		vip=v;
		
	}
	
	public void display() {
		System.out.println("AttendeeId: "+attendeeId+" firstName: "+firstName+" lastName: "+lastName+ " phone: "+phone+" email: "+email+" vip: "+vip  );
	}
	
	

}
