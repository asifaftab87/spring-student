package org.la.student.abdullahi.methods.setters.getters;

public class RoomMain {


	public static void main(String[] args) {
		
		Room room= new Room();
		room.setRoomNumb(5);
		room.setFloorNumb("F12");
		room.setSeatCapacity("2000 seats");
		
		int RoomNumb= room.getRoomNumb();
		String FloorNumb= room.getFloorNumb();
		String SeatCapacity= room.getSeatCapacity();
		
		System.out.println("Room Number = "+RoomNumb);
		System.out.println("Floor Number = "+FloorNumb);
		System.out.println("Seat Capacity = "+SeatCapacity);
		
		
		
		
		
		
		
		
		
	}
 
}