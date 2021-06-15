package org.la.student.noor;
/*Create a class Presentation having member variables presentationId, bookedCompanyId, bookedRoomId, startTime, endTime. Create getters and setters for all member variables. Create object of Presentation class in other class inside main method and set all member values and print all member values using getters.*/


public class Presentation {
	private int presentationId;
	private int bookedCompanyId;
	private int bookedRoomId;
	private double startTime;
	private double endTime;
	
	
	public void setPresentationId(int p) {
		presentationId=p;
	}
	public int getPresentationId() {
		return presentationId;
	}
	
	public void setBookedCompanyId(int c) {
		bookedCompanyId=c;
	}
	
	public int getBookedCompanyId() {
		return bookedCompanyId;
	}
	
	public void setBookedRoomId(int r) {
		bookedRoomId=r;
	}
	
	public int getBookedRoomId() {
		return bookedRoomId;
	}
	
	public void setStartTime(double s) {
		startTime=s;
	}
	
	public double getStartTime() {
		return startTime;
	}
	
	public void setEndTime(double e) {
		endTime=e;
	}
	
	public double getEndTime() {
		return endTime;
	}
	
	
	
	
	
		
	public void display() {
		System.out.println("presentationId:" +presentationId);
		System.out.println("bookedCompanyId:" +bookedCompanyId);
		System.out.println("bookedRoomId:" +bookedRoomId);
		System.out.println("startTime:" +startTime);
		System.out.println(" endTime:" + endTime);
	}
	
}
