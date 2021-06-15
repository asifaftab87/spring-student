package org.la.student.barry.clas.task;

public class PresentationAttendance {

	/*
	 * Create a class PresentationAttendance having member variables ticketId, 
	 * presentationId, attendeeId. create getters and setters for all member variables. 
	 * Create object of PresentationAttendance class in other class inside main method and 
	 * set all member values and print all member values using getters.
	 */
	private int ticketId;
	private int presentationId;
	private int attendeeId;
	
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int i) {
		ticketId=i;
	}
	public int getPresentationId() {
		return presentationId;
	}
	public void setPresentationId(int i) {
		presentationId=i;
	}
	public int getAttendeeId() {
		return attendeeId;
	}
	public void setAttendeeId(int i) {
		attendeeId=i;
	}
	public void display() {
		System.out.println("TicketId: " +ticketId+"  PresentationId: " +presentationId+" "
				+ " AttendeeId: " +attendeeId);
	}
}
