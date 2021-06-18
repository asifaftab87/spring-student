package org.la.student.jamal.clas;

/*5.	Create a class PresentationAttendance having member variables ticketId,
 *  presentationId, attendeeId. create getters and setters for all member variables.
 *   Create object of PresentationAttendance class in other class inside main method and 
 *   set all member values and print all member values using getters.
 * 
 */
		

public class PresentationAttendance {
	
	private int ticketId ;
	private int presentationId;
	private int attendeeId;
	
	public int getTicketId() {
		return ticketId;
		
	}
	
	public int getPresentationId() {
		return presentationId;
		
	}
	
	public int getAttendeeId() {
		return attendeeId;
		
	}
	
	public void setTicketId(int tid) {
		ticketId=tid;
		
	}
	
	public void setPresentationId(int pid) {
		presentationId=pid;
		
	}
	
	public void setAttendeeId(int aid) {
		attendeeId=aid;
		
	}
	 public void display() {
		 System.out.println("ticketId: "+ticketId+" presentationId: "+presentationId+" AttendeeId: "+attendeeId);
	 }
	
}
