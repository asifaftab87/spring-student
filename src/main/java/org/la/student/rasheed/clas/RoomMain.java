package org.la.student.rasheed.clas;

public class RoomMain {

	public static void main(String[] args) {
		
		
		Room room = new Room ();
		
		
		room.setroomId(23);
		room.setfloorNum(20);
		room.setseatCapacity("One person each");
		
		
		
		int roomId = room.getroomId();
		int floorNum = room.getfloorNum();
		String seatCapacity = room.getseatCapacity();
		
		
		
		System.out.println("Room Id : "+roomId);
		System.out.println("Floor Number : "+floorNum);
		System.out.println("Seat Capacity : "+seatCapacity);
		

	}

}
