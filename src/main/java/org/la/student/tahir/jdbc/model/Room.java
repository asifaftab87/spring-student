package org.la.student.tahir.jdbc.model;

import java.io.Serializable;

public class Room implements Serializable{

	private static final long serialVersionUID = -8545901547885450379L;
	
	private int roomId, floorNum, seatCapacity;

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public int getFloorNum() {
		return floorNum;
	}

	public void setFloorNum(int floorNum) {
		this.floorNum = floorNum;
	}

	public int getSeatCapacity() {
		return seatCapacity;
	}

	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}

	public String toString() {
		
		return "roomId:"+ roomId+" floorNum:"+ floorNum+" seatCapacity:"+ seatCapacity;
	}
	
	
	

}
