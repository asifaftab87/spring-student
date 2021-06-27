package org.la.student.abdullahi.methods.setters.getters;

public class Attendee {


	private int AttendeeId;
	private String FirstName;
	private String LastName;
	private String Phone;
	private String Email;
	private String VIP;
	
	
	public void setAttendeeId(int a) {
		AttendeeId=a;
	}

	public int getAttendeeId() {
		
		return AttendeeId;
	}
	
	public void setFirstName(String f) {
		FirstName=f;
	}
	public String getFirstName() {
		
		return FirstName;
	}
	
	public void setLastName(String l) {
		LastName=l;
	}
	public String getLastName() {
		return LastName;
	}
	
	public void setPhone(String p) {
		
		Phone=p;
	}
	public String getPhone() {
		return Phone;
	}
	
	public void setEmail(String e) {
		Email=e;
	}
	public String getEmail() {
		return Email;
	}
	public void setVIP( String v) {
		VIP=v;
	}
	public String getVIP() {
		return VIP;
	}
	
	
 
}