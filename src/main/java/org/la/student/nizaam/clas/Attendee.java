package org.la.student.nizaam.clas;

/*
 * 	4.	Create a class Attendee having member variables attendeeId, firstName, lastName, phone, email, vip. create getters and setters for all member variables. 
		Create object of Attendee class in other class inside main method and set all member values and print all member values using getters.
 */
public class Attendee {

	private int attendeeId;
	private long phone;
	private String firstName,lastName,email;
	private boolean vip;
	public int getAttendeeId() {
		return attendeeId;
	}
	public void setAttendeeId(int attendeeId) {
		this.attendeeId = attendeeId;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isVip() {
		return vip;
	}
	public void setVip(boolean vip) {
		this.vip = vip;
	}
}
