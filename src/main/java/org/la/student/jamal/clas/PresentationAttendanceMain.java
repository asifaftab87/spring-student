package org.la.student.jamal.clas;

public class PresentationAttendanceMain {

	public static void main(String[] args) {
		
		
		PresentationAttendance presentationAttendance=new PresentationAttendance();


		presentationAttendance.setTicketId(12133);
		presentationAttendance.setPresentationId(12);
		presentationAttendance.setAttendeeId(121212);
		
		presentationAttendance.display();
		System.out.println();
		
		int tid=presentationAttendance.getTicketId();
		int pid=presentationAttendance.getPresentationId();
		int aid=presentationAttendance.getAttendeeId();
		System.out.println("TicketId: "+tid+" PresentationId: "+pid+" AttendeeId : "+aid);
	}

}
