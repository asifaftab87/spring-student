package org.la.student.rasheed.clas;

public class PresentationAttendanceMain {

	public static void main(String[] args) {
		
		
		PresentationAttendance presentationattendance = new PresentationAttendance();
		presentationattendance.setticketId(20);
		presentationattendance.setpresentationId(2010);
		presentationattendance.setattendanceId(60);
		
		
		int ticketId = presentationattendance.getticketId();
		int presentationId = presentationattendance.getpresentationId();
		int attendanceId = presentationattendance.getattendanceId();
		
		
		System.out.println("Ticket Id : "+ticketId);
		System.out.println("Presentattion Id : "+presentationId);
		System.out.println("Attendance Id : "+attendanceId);
	}

}
