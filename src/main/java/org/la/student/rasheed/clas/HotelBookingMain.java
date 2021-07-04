package org.la.student.rasheed.clas;

public class HotelBookingMain {

	public static void main(String[] args) {
		
		
		HotelBooking hotelbooking = new HotelBooking();
		hotelbooking.setpresentationId(12);
		hotelbooking.setbookedCompanyId(00123);
		hotelbooking.setbookedRoomId(210);
		hotelbooking.setstartTime("Thursday 11:00 am");
		hotelbooking.setendTime("Sunday 12:00 pm");
		
		
		
		int presentationId = hotelbooking.getpresentationId();
		int bookedCompanyId = hotelbooking.getbookedCompanyId();
		int bookedRoomId = hotelbooking.getbookedRoomId();
		String startTime = hotelbooking.getstartTime();
		String endTime = hotelbooking.getendTime();
		
		
		
		System.out.println("presentation Id: "+presentationId);
		System.out.println("Booked company Id: "+bookedCompanyId);
		System.out.println("Booked room Id: "+bookedRoomId);
		System.out.println("Start time: "+startTime);
		System.out.println("End time: "+endTime);
	}
	

}
