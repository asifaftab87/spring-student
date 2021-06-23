package org.la.student.bakil.objects;

public class BookingMain {

	public static void main(String[] args) {
		
		Booking booking = new Booking ();
		booking.setpresentationId(22);
		booking.setBookedID(223);
		booking.setbookedRoomId(321);
		booking.setstartTime("Monday 12:00pm");
		booking.setendTime("Tuesday 12:00 pm");

		int presentationId = booking.getpresentationId();
		int bookedCompanyId =booking.getBookedID();
		int bookedRoomId = booking.getbookedRoomId();
		String startTime = booking.getstartTime();
		String endTime = booking.getendtTime();
		System.out.println("Presentation Id: "+presentationId);
		System.out.println("Booked company Id: "+bookedCompanyId);
		System.out.println("booked Room Id : "+bookedRoomId);
		System.out.println("Start time : "+startTime);
		System.out.println("End time: "+endTime);
	}
}
