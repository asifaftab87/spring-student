package org.la.student.bakil.objects;

public class RoomMain {

	public static void main(String[] args) {
	
		Room room = new Room() ;
			
		room.setroomId(9821);
		room.setfloorNum(23);
		room.setsetCapacity(2);
		
		int roomId = room.getroomId();
		int floorNum= room.getfloorNum();
		int setCapacity = room.getsetCapacity();
		 System.out.println("Room Id "+roomId);
		 System.out.println("Floor Number "+floorNum);
		System.out.println("Set capacity "+setCapacity);
		

	}

}
