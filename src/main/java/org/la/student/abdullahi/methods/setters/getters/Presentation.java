package org.la.student.abdullahi.methods.setters.getters;

public class Presentation {


	private int PresentationId;
	private String BookedCompanyId;
	private String BookedRoomId;
	private String StartTime;
	private String EndTime;
	
	public void setPresentationId(int p) {
		PresentationId=p;
	}

	public int getPresentationId() {
		
		return PresentationId;
	}
	
	public void setCompanyId(String c) {
		BookedCompanyId=c;
	}
	public String getCompanyId() {
		
		return BookedCompanyId;
	}
	
	public void setRoomId(String r) {
		BookedRoomId=r;
	}
	public String getRoomId() {
		return BookedRoomId;
	}
	
	public void setStartTime(String s) {
		
		StartTime=s;
	}
	public String getStartTime() {
		return StartTime;
	}
	
	public void setEndTime(String e) {
		EndTime=e;
	}
	public String getEndTime() {
		
		return EndTime;
	}


 
}