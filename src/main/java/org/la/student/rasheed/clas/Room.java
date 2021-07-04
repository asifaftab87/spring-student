package org.la.student.rasheed.clas;

/*
 * Create a class Room having member variables roomId, floorNum, seatCapacity. 
 * create getters and setters for all member variables. 
 * Create object of Room class in other class inside main method
		and set all member values and print all member values using getters.
 */

public class Room {
	
	private int roomId;
	private int floorNum;
	private String seatCapacity;
	
	
	public int getroomId() {
		return roomId;
	}
	public int getfloorNum() {
		return floorNum;
	}
	public String getseatCapacity() {
		return seatCapacity;
		
	}
	public void setroomId(int i) {
		roomId = i;	
	}
	public void setfloorNum(int f) {
		floorNum = f;
	}
	public void setseatCapacity(String c) {
		seatCapacity = c;
	}
	
	public void display() {
		System.out.println("Room Id: "+roomId+" Floor Number : "+floorNum+" Seat Capacity : "+seatCapacity);
	}

}
