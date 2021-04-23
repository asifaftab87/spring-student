package org.la.student.tahir.jdbc.model;

import java.io.Serializable;

public class Presentation implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8545901547885450379L;
	private int presentationId, bookedCompanyId, bookedRoomId;
	private String startTime, endTime;
	
	public int getPresentationId() {
		return presentationId;
	}
	public void setPresentationId(int presentationId) {
		this.presentationId = presentationId;
	}
	public int getBookedCompanyId() {
		return bookedCompanyId;
	}
	public void setBookedCompanyId(int bookedCompanyId) {
		this.bookedCompanyId = bookedCompanyId;
	}
	public int getBookedRoomId() {
		return bookedRoomId;
	}
	public void setBookedRoomId(int bookedRoomId) {
		this.bookedRoomId = bookedRoomId;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
	public String toString() {
		
		return "presentationId:"+presentationId+ " bookedCompanyId:"+bookedCompanyId+" bookedRoomId:"+ bookedRoomId +" startTime:" +startTime+" endTime:" + endTime;
	}
	
	

}
