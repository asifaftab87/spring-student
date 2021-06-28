package org.la.student.abdullahi.methods.setters.getters;

public class AttendeeMain {

	public static void main(String[]args) {
		
		Attendee attendee= new Attendee();
		attendee.setAttendeeId(1);
		attendee.setFirstName("Muhammad");
		attendee.setLastName("Abdullah");
		attendee.setPhone("0163252625");
		attendee.setEmail("muammad360@gmail.com");
		attendee.setVIP("VIP");
		
		int AttendeeId= attendee.getAttendeeId();
		String FirstName= attendee.getFirstName();
		String LastName= attendee.getLastName();
		String Phone = attendee.getPhone();
		String Email= attendee.getEmail();
		String VIP =attendee.getVIP();
		
		System.out.println("Attendee Id = "+ AttendeeId);
		System.out.println("First Name = "+ FirstName);
		System.out.println("Last Name = "+ LastName);
		System.out.println("Phone = " + Phone);
		System.out.println("Email = "+ Email);
		System.out.println("VIP = "+ VIP);
		
		
		
	}
}