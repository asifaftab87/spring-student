package org.la.student.bakil.objects;
/*
 * Create a class PresentationAttendance having member variables ticketId, presentationId, attendeeId. create getters and setters for all member variables. 
   Create object of PresentationAttendance class in other class inside main method and set all member values and print all member values using getters.
 */
public class PresentationAttendance {

	
	
	private int ticketId;
	private int presentationId;
	private int attendeeId;
	
	// Ticket Id
	public void setticketId(int i){
		ticketId=i;	
	}
	public int getticketId() {
		return ticketId;
	}
	
	// Presentation Id
	public void setpresentationId(int p) {
		presentationId=p;
	}
	public int getpresentationId() {
		return presentationId;
	}
	
	//Attendee Id
	
	public void setattendeeId(int t) {
		attendeeId=t;
	}
	public int getattendeeId() {
		return attendeeId;
	}
	
	public void display () {
		System.out.println("Presentation Id :"+presentationId+"Ticket Id :"+ticketId+"Attendee Id :"+attendeeId);
	}
}
