package org.la.student.tahir.jdbc.service;

import java.util.List;

import org.la.student.tahir.jdbc.model.Room;
import org.la.student.tahir.jdbc.repository.RoomRepository;

public class RoomService {

	
	public RoomService() {
		
		RoomRepository.connectionOpen();
	}
	
	public static List<Room> findAll(){
		List<Room> roomlist = RoomRepository.findAll();
		
		return roomlist;
		
	}
	
	public static Room findByRoomId(int roomId) {
		
		return RoomRepository.findByRoomId(roomId);
	}
	
	
	public static List<Room> findByfloorNum(int room){
		
		List<Room> roomlist = RoomRepository.findByfloorNum(room);
		
		return roomlist;
	}
	
	public static List<Room> findByseatCapacity(int room){
		

		List<Room> roomlist = RoomRepository.findByseatCapacity(room);
		
		return roomlist;
	}
	
	public static void create(Room room) {
		RoomRepository.create(room);
		
	}
	
	public static void update() {
		
		RoomRepository.update();
		
		Room room = new Room();
		
		room.getRoomId();
		room.getFloorNum();
		room.getSeatCapacity();
	}
	
	
}
