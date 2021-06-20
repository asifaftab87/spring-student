package org.la.student.kayes.methods;

public class RoomMain {

	public static void main(String[] args) {
		Room room=new Room();
		room.setroomId(50);
		room.setfloorNum(10);
		room.setseat(500);
		
		int n1=room.getroomId();
		int n2=room.getfloorNum();
		int n3=room.getseat();
		
		System.out.println("room id  =  "+n1);
		System.out.println("floor number  =  "+n2);
		System.out.println("seat capacity  =  "+n3);
	}
	

}
