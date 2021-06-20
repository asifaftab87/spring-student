package org.la.student.jamal.clas;
/*
 * 3.	Create a class Room having member variables roomId, floorNum, seatCapacity. create getters and 
		setters for all member variables. Create object of Room class in other class inside main method
		and set all member values and print all member values using getters.
 */

public class Room {
	
	private int floorNum ;
	private int roomId;
	private int seatCapacity;
	
	
	
	
	public int getSeatCapacity() {
		return seatCapacity;
		
	}
	public int getFloorNum() {
		return floorNum;
	}
	
	public int getRoomId() {
		return roomId;
	}
	
	public void setFloorNum(int fn) {
		floorNum=fn;
		
	}
	
	public void setRoomId(int rid) {
		roomId=rid;
		
	}
	
	public void setSeatCapacity(int sc) {
		seatCapacity=sc;
		
	}
	
	public void display() {
		System.out.println("floorNum: "+floorNum+" roomId: "+roomId+" seatCapacity: "+seatCapacity);
	}

}
