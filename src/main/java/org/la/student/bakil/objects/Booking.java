package org.la.student.bakil.objects;
/*/
 * Create a class Presentation having member variables presentationId, bookedCompanyId, bookedRoomId, startTime, 
   endTime. Create getters and setters for all member variables. Create object of Presentation class in other class inside main method 
   and set all member values and print all member values using getters.
 */
public class Booking {


	private int presentationId;
	private int bookedCompanyId;
	private int bookedRoomId;
	private String startTime;
	private String endTime;
	
	
	
	//Presention ID
	
	public void setpresentationId(int i) {
		presentationId = i;
	}
	public int getpresentationId() {
		return presentationId;
	}
	
	//Booked ID
	
	public void setBookedID(int b) {
		bookedCompanyId = b;
	}
	public int getBookedID() {
		return bookedCompanyId;
	}
	
	//Room ID
	public void setbookedRoomId(int r) {
		bookedRoomId =r;
	}
	public int getbookedRoomId() {
		return bookedRoomId;
	}
	
	//start Time
	public void setstartTime(String t) {
		startTime =t;
	}
	public String getstartTime() {
		return startTime;
	}
	
	//End Time
	public void setendTime(String e) {
		endTime =e;
	}
	public String getendtTime() {
		return endTime;
	}
	
	
	public void display() {
		System.out.println("Presention ID : "+presentationId+"  Booked company Id: "+bookedCompanyId+
				"  Booked room Id: "+bookedRoomId+"Start time"+startTime+"End time"+endTime);
	}
}