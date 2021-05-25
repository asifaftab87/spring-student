package org.la.student.tahir.jdbc.model;

import java.io.Serializable;

public class Attendee implements Serializable {

	private static final long serialVersionUID = -8545901547885450379L;
	
	private int  attendeeId;
	private String firstName, lastName, phone, email, vip;
	
	
	public int getAttendeeId() {
		return attendeeId;
	}
	public void setAttendeeId(int attendeeId) {
		this.attendeeId = attendeeId;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getVip() {
		return vip;
	}
	public void setVip(String vip) {
		this.vip = vip;
	}
	@Override
	public String toString() {
		return "Attendee [attendeeId:" + attendeeId + ", firstName:" + firstName + ", lastName:" + lastName + ", phone:"
				+ phone + ", email:" + email + ", vip:" + vip + "]";
	}
	
	
	
}
