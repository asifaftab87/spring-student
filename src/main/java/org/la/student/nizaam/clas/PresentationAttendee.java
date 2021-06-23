package org.la.student.nizaam.clas;

/*
 * Create a class PresentationAttendance having member variables ticketId, presentationId, attendeeId. create getters and setters for all member variables. 
		Create object of PresentationAttendance class in other class inside main method and set all member values and print all member values using getters.
 */
public class PresentationAttendee {

	private int ticketId,presentationId;
	private String attendeeId;
	
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public int getPresentationId() {
		return presentationId;
	}
	public void setPresentationId(int presentationId) {
		this.presentationId = presentationId;
	}
	public String getAttendeeId() {
		return attendeeId;
	}
	public void setAttendeeId(String attendeeId) {
		this.attendeeId = attendeeId;
	}
	
}
