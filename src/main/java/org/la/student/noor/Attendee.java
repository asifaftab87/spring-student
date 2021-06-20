package org.la.student.noor;
/*Create a class Attendee having member variables attendeeId, firstName, lastName, phone, email, vip. create getters and setters for all member variables. Create object of Attendee class in other class inside main method and set all member values and print all member values using getters.*/

public class Attendee {
	private int attendeeId;
	private String firstName;
	private String lastName;
	private String phone;
	private String email;
	private String vip;
	
	public void setattendeeId(int i) {
		attendeeId=i;
	}
	public int getattendeeId() {
		return attendeeId;
	}
	
	public void setfirstName(String f) {
		firstName=f;
	}
	public String getfirstName() {
		return firstName;
	}
	
	
	public void setlastName(String l) {
		lastName=l;
	}
	public String getlastName() {
		return lastName;
	}
	
	public void setphone(String p) {
		phone=p;
	}
	public String getphone() {
		return phone;
	}
	
	public void setemail(String e) {
		email=e;
	}
	public String getemail() {
		return email;
	}
	
	public void setvip(String v) {
		vip=v;
	}
	public String getvip() {
		return vip;
	}
	
	
	public void display() {
		System.out.println("attendeeId:" +attendeeId);
		System.out.println(" firstName:" + firstName);
		System.out.println(" lastName:" + lastName);
		System.out.println(" phone:" + phone);
		System.out.println("email:" +email);
		System.out.println("vip:" +vip);
	}
	
	
	
	
}
