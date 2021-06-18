package org.la.student.barry.clas.task;

public class Presentation {
/*
 * Create a class Presentation having member variables presentationId, 
 * bookedCompanyId, bookedRoomId, startTime, endTime. 
 * Create getters and setters for all member variables. 
 * Create object of Presentation class in other class inside main method and set all member values and print all member values using getters.
 */
	
	private int presentationId;
	private int bookedCompanyId;
	private int bookedRoomId;
	private String startTime;
	private String endTime;
	
	public int getPresentationId() {
		return presentationId;
	}
	 public void setPresentationId(int i) {
		 presentationId=i;
	 }
	
	 public int getBookedCompanyId() {
			return bookedCompanyId;
		}
		 public void setBookedCompanyId(int j) {
			 bookedCompanyId=j;
		 }
		 public int getBookedRoomId() {
				return bookedRoomId;
			}
			 public void setBookedRoomId(int k) {
				 bookedRoomId=k;
			 }
			 public String getStartTime() {
					return startTime;
				}
				 public void setStartTime(String s) {
					 startTime=s;
				 }
				 public String getEndTime() {
						return endTime;
					}
					 public void setEndTime(String e) {
						 endTime=e;
					 }
					 public void display() {
						 System.out.println("presentationId:  " +presentationId+"      bookedCompanyId:  "+bookedCompanyId+"   "
						 		+ " bookedRoomId: "+bookedRoomId+"   startTime: "+startTime+" "
						 		+ "  endTime: "+endTime);
			 }
}
