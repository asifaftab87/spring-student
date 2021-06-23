package org.la.student.bakil.objects;
/*
 * Create a class Attendee having member variables attendeeId, firstName, lastName, phone, email, vip. 
 * create getters and setters for all member variables. 
   Create object of Attendee class in other class inside main method and set all member values and print all member values using getters.
 */
public class Attendee {

	
	
	private String firstName;
	private String lastName;
	private String phone;
	private String email;
	private String vip;
	
	//First name 
	public void setfirstName(String n) {
		firstName=n;
	}
	public String getfirstName() {
		return firstName;
	}
	
	//Last Name
	public void setlastName (String l) {
		lastName=l;
	}
	public String getlastName() {
		return lastName;
	}
		//Phone 
		public void setphone (String p) {
			phone =p;
		}
		public String getphone () {
			return phone;
		}
		
		//Email
		public void setemail(String e) {
			email=e;
		}
		public String getemail() {
			return email;
		}
		
		// Vip 
		public void setvip(String v) {
			vip =v;
		}
		public String getvip() {
			return vip;
		}
	
	public void display () {
		System.out.println("First name :"+firstName+"Last name "+lastName+"Phone number "+phone+"Email "+email+"Vip "+vip);
	}
}
