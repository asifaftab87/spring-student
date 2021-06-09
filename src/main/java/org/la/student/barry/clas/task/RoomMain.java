package org.la.student.barry.clas.task;

public class RoomMain {

	public static void main(String[] args) {
		Room room= new Room();
		room.setRoomId(1234);
		room.setFloorNum(5);
		room.setSeatCapacity(65);
		
		
		 room.dispalay();
		 
		 System.out.println("......end.... ...");
		 System.out.println("Displaying with getter");
		 int roomId= room.getRoomId();
		 int floorNum=room.getFloorNum();
		 int seatCapacity= room.getSeatCapacity();
		 
		 System.out.println("RoomId:"+roomId);
		 System.out.println("FloorNum:"+floorNum);
         System.out.println("SeatCapacity:"+seatCapacity);
	}

}
