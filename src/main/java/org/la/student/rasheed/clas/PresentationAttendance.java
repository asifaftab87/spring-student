package org.la.student.rasheed.clas;

/*
 * Create a class PresentationAttendance having member variables ticketId, presentationId, attendeeId. 
 * create getters and setters for all member variables.
 *  Create object of PresentationAttendance class in other class inside main method and 
 *  set all member values and print all member values using getters.
 */

public class PresentationAttendance {
	
	
	private int ticketId;
	private int presentationId;
	private int attendanceId;
	
	
	public int getticketId() {
		return ticketId;
	}
	public int getpresentationId() {
		return presentationId;
	}
	public int getattendanceId() {
		return attendanceId;
	}
	
	
	public void setticketId (int t) {
		ticketId = t;
	}
	public void setpresentationId (int p) {
		presentationId = p;
	}
	public void setattendanceId (int a) {
		attendanceId = a;
	}
	public void display() {
		System.out.println(" Ticket Id : "+ticketId+" Presentation Id : "+presentationId+" Attendance Id : "+attendanceId);
	}
	
	


}
