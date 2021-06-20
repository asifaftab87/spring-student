package org.la.student.kayes.methods;

public class PresentationAttendenceMain {

	public static void main(String[] args) {
		PresentationAttendence att=new PresentationAttendence();
		att.setticketId(8);
		att.setpresentationId(755);
		att.setattendeeId(100);
		
		int n1=att.getticketId();
		int n2=att.getpresentationId();
		int n3=att.getattendeeId();
				
		System.out.println("ticket id  =  "+n1);
		System.out.println("presentation id  =  "+n2);
		System.out.println("attendee id  =  "+n3);
	}

}
