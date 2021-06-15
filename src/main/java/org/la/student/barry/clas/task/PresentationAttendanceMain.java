package org.la.student.barry.clas.task;

public class PresentationAttendanceMain {

	public static void main(String[] args) {
		PresentationAttendance presentationattendance= new PresentationAttendance();
		presentationattendance.setAttendeeId(15);
		presentationattendance.setPresentationId(30);
		presentationattendance.setTicketId(20);
		
		
	 // presentationattendance.display();
	  
	  int ticketId= presentationattendance.getTicketId();
	  int attendeeId= presentationattendance.getAttendeeId();
	  int presentationId= presentationattendance.getPresentationId();
	  
	  System.out.println(".....Getters ........");
	  
	  System.out.println("TicketId: "+ ticketId);
	  System.out.println("AttendeeId:"+attendeeId);
	  System.out.println("PresentationId"+ presentationId);

	}


}
