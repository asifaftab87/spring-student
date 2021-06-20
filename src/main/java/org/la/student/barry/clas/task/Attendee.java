package org.la.student.barry.clas.task;

public class Attendee {
	/*
	 * 	Create a class Attendee having member variables attendeeId, 
	 * firstName, lastName, phone, email, vip. create getters and setters for all member variables.
	 *  Create object of Attendee class in other class inside main method and set all member values and
	 *   print all member values using getters.
	 */
 
	public int attendeeId;
	private String firstName;
	private String lastName;
	private int phone;
	private String email;
	private String vip;
	
	public int getAttendeeId() {
		return attendeeId;
	}
	public void setAttendeeId(int i) {
		attendeeId=i;
	}
	
	public int getPhone() {
		return phone;
	}
	public void setPhone(int j) {
		phone=j;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String f) {
		firstName=f;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String l) {
		lastName=l;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String e) {
		email=e;
	}
	public String getVip() {
		return firstName;
	}
	public void setVip(String v) {
		vip=v;
	}
	
	public void display() {
		System.out.println("AttendeeId: " +attendeeId+"      FirstName: " +firstName+"   LastName: "+lastName+ 
				"Phone: "+phone+"  Email: "+email+"  Vip: "+vip );
	}
	
}
