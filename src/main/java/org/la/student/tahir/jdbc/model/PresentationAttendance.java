package org.la.student.tahir.jdbc.model;

public class PresentationAttendance {

	private int  ticketId, presentationId, attendeeId;


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

	public int getAttendeeId() {
		return attendeeId;
	}

	public void setAttendeeId(int attendeeId) {
		this.attendeeId = attendeeId;
	}


	@Override
	public String toString() {
		return "PresentationAttendance [ticketId=" + ticketId + ", presentationId=" + presentationId + ", attendeeId="
				+ attendeeId + "]";
	}
	
	
}
