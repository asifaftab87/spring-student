package org.la.student.rasheed.clas;


/*
 * Create a class Presentation having member variables presentationId, bookedCompanyId, bookedRoomId, startTime, endTime. 
 * Create getters and setters for all member variables. 
 * Create object of Presentation class in other class inside main method and 
 * set all member values and print all member values using getters.
 */

public class HotelBooking {
	
	private int presentationId;
	private int bookedCompanyId;
	private int bookedRoomId;
	private String startTime;
	private String endTime;
	
	
	
	
	
	
	public int getpresentationId() {
		return presentationId;
	}
	public int getbookedCompanyId() {
		return bookedCompanyId;
	}
	public int getbookedRoomId() {
		return bookedRoomId;
	}
	public String getstartTime() {
		return startTime;
	}
	public String getendTime() {
		return endTime;
		
	}
	
	public void setpresentationId(int i) {
		presentationId = i;
		
	}
	public void setbookedCompanyId(int b) {
		bookedCompanyId = b;
	}
	public void setbookedRoomId(int r) {
		bookedRoomId = r;
	}
	public void setstartTime(String t) {
		startTime = t;
	}
	public void setendTime(String e) {
		endTime = e;
		
	}
	
	public void display() {
		System.out.println("Presntation Id : "+presentationId+" Booked company Id: "+bookedCompanyId+" Booked room Id : "+bookedRoomId+" Start time : "+startTime+" End time : "+endTime);
	}
}
	
	


