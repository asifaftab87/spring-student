package org.la.student.noor;

public class RoomMain {

	public static void main(String[] args) {
		Room room=new Room();
		room.setroomId(101);
		room.setfloorNum(3);
		room.setseatCapacity("three persons");
		
		//room.display();
		
		int roomId=room.getroomId();
	    int setfloorNum=room.getfloorNum();
		String setseatCapacity=room.getseatCapacity();

		
		System.out.println("roomId:" +room.getroomId());
		System.out.println("floorNum:" +room.getfloorNum());
		System.out.println("seatCapacity:" +room.getseatCapacity());
	}

}
