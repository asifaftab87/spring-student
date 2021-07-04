package org.la.student.rasheed.clas;


public class AttendeeMain {

	public static void main(String[] args) {
		
		
		Attendee attendee = new Attendee();
		attendee.setattendeeId(10290);
		attendee.setfirstName("Abdulrasheed");
		attendee.setlastName("Ibrahim");
		attendee.setphone(1133210469);
		attendee.setemail("Rasboy3c@gmail.com");
		attendee.setvip("Umaru");
		
		
		
		int attendeeId = attendee.getattendeeId();
		String firstName =attendee.getfirstName();
		String lastName =attendee.getlastName();
		int phone = attendee.phone();
		String email =attendee.getemail();
		String vip =attendee.getvip();
		
		
		System.out.println("Attendee Id: "+attendeeId);
		System.out.println("First Name: "+firstName);
		System.out.println("Last Name: "+lastName);
		System.out.println("Phone Number: "+phone);
		System.out.println("Email Address: "+email);
		System.out.println("VIP: "+vip);
		

	}

}
