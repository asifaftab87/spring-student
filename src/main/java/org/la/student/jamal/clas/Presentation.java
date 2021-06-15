package org.la.student.jamal.clas;
/*2.	Create a class Presentation having member variables presentationId, bookedCompanyId, 
 * bookedRoomId, startTime, endTime. Create getters and setters for all member variables. 
 * Create object of Presentation class in other 
 * class inside main method and set all member values and print all member values using getters.
 */

public class Presentation {
	
	private String name ;
	private int presentationId;
	private int bookedCompanyId;
	private int bookedRoomId;
	private String startTime;
	private String endTime;
	
	public String getEndTime() {
		return endTime;
	}
	
	public String getStartTime() {
		return startTime;
	}
	
	public int getBookedRoomId() {
		return bookedRoomId;
	}
	
	public int getBookedCompanyId() {
		return bookedCompanyId;
		
	}
	public String getName() {
		return name;
	}
	
	public int getPresentationId() {
		return presentationId;
	}
	
	public void setName(String n) {
		name=n;
		
	}
	
	public void setPresentationId(int pid) {
		presentationId=pid;
		
	}
	
	public void setBookedCompanyId(int cid) {
		bookedCompanyId=cid;
		
	}
	
	public void setBookedRoomId(int rid) {
		bookedRoomId=rid;
		
	}
	
	public void setStartTime(String st) {
		startTime=st;
		
	}
	
	public void setEndTime(String et) {
		endTime=et;
		
	}
	
	public void display() {
		System.out.println("Name: "+ name +" Presentation Id : "+presentationId+" Booked Company Id : "
	+bookedCompanyId+" Booked Room Id : "+bookedRoomId+" StartTime : "
				+startTime+" End Time : "+ endTime);
	}
	
	

	

}
