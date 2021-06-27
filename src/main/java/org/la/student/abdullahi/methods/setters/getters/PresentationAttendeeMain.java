package org.la.student.abdullahi.methods.setters.getters;

public class PresentationAttendeeMain {


	
	public static void main(String[] args) {
		
		PresentationAttendee p= new PresentationAttendee();
		p.setTicketId(1);
		p.setPresentationId("1122");
		p.setAttendeeeId("001");
		
		int TicketId= p.getTicketId();
		String PresentationId= p.getPresentationId();
		String AttendeeeId = p.getAttendeeeId();
		
		System.out.println("Ticket Id = " +TicketId );
		System.out.println("Presentation Id = "+ PresentationId);
		System.out.println("Attendee Id = "+ AttendeeeId);
		
		
		
	}
}