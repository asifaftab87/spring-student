package org.la.student.bakil.objects;

public class PresentationAttendanceMain {

	public static void main(String[] args) {
		
		PresentationAttendance attendance= new PresentationAttendance();
		
		attendance.setpresentationId(122);
		attendance.setattendeeId(223);
		attendance.setticketId(8777);
		
		
		int presentationId=attendance.getpresentationId();
		int attendanceId =attendance.getattendeeId();
		int ticketId = attendance.getticketId();
		
		System.out.println("Presentation Id : "+"("+presentationId+")");
		System.out.println("Attendance Id   : "+"("+attendanceId+")");
		System.out.println("Ticket Id       : "+"("+ticketId+")");

	}

}
