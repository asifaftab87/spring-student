package org.la.student.abdullahi.methods.setters.getters;

public class Room {


	private int RoomNumb;
	private String FloorNumb;
	private String SeatCapacity;
	
	
	public void setRoomNumb(int n) {
		RoomNumb=n;
	}

	public int getRoomNumb() {
		
		return RoomNumb;
	}
	
	public void setFloorNumb(String f) {
		FloorNumb=f;
	}
	public String getFloorNumb() {
		
		return FloorNumb;
	}
	
	public void setSeatCapacity(String c) {
		SeatCapacity=c;
	}
	public String getSeatCapacity() {
		return SeatCapacity;
	}
	
	
 
}