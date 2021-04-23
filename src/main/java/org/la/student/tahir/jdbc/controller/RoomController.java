package org.la.student.tahir.jdbc.controller;

import java.util.List;

import org.la.student.tahir.jdbc.model.Room;
import org.la.student.tahir.jdbc.service.RoomService;

public class RoomController {

	RoomService rService = null;
	RoomController(){
		
		rService = new RoomService();
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		RoomController roomCntrl = new RoomController();
		
		roomCntrl.addRoom();
		roomCntrl.findByseatCapacity(25);
	}
	
	
	void findAll() {
		
		List<Room> roomlist = RoomService.findAll();
		
		System.out.println(roomlist);
	}
	
	void findByRoomId(	int roomId) {
		
	
		Room room = RoomService.findByRoomId(roomId);
		
		System.out.println(room);
		
		
	}
	
	void findByfloorNum(int floorNum) {
		

		List<Room> roomlist = RoomService.findByfloorNum(floorNum);
		
		System.out.println(roomlist);
		
	}
	
	void  findByseatCapacity(int seatCapacity) {
		
		List<Room> roomlist = RoomService.findByseatCapacity(seatCapacity);
		
		System.out.println(roomlist);
	}
	
	void addRoom() {
		
		Room room = new Room();
		
		room.setRoomId(1);
		room.setFloorNum(11);
		room.setSeatCapacity(25);
		
		RoomService.create(room);
		
	}

}
