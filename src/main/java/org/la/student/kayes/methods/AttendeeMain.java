package org.la.student.kayes.methods;

public class AttendeeMain {

	public static void main(String[] args) {
		Attendee attend=new Attendee();
		attend.setattendeeId(15);
		attend.setFname("ROMAN");
		attend.setlname("Kayes");
		attend.setphone("9903210705");
		attend.setEmail("abc@gmail.com");
		
		int id=attend.getattendeeId();
		String fname=attend.getFname();
		String lname=attend.getLname();
		String phone=attend.getphone();
		String email=attend.getEmail();
		
		System.out.println("attendee id  =  "+id);
		System.out.println("first name  =  "+fname);
		System.out.println("last name  =  "+lname);
		System.out.println("phone  =  "+phone);
		System.out.println("email  =  "+email);
		

	}

}
