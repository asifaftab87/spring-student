package org.la.student.abdullahi.methods.setters.getters;

public class PresentationAttendee {


	private int TicketId;
	private String PresentationId;
	private String AttendeeeId;
	
	
	public void setTicketId(int t) {
		TicketId=t;
	}

	public int getTicketId() {
		
		return TicketId;
	}
	
	public void setPresentationId(String p) {
		PresentationId=p;
	}
	public String getPresentationId() {
		
		return PresentationId;
	}
	
	public void setAttendeeeId(String a) {
		AttendeeeId=a;
	}
	public String getAttendeeeId() {
		return AttendeeeId;
	}
	


 
}