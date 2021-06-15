package org.la.student.noor;
/*Create a class Room having member variables roomId, floorNum, seatCapacity. create getters and 
		setters for all member variables. Create object of Room class in other class inside main method
		and set all member values and print all member values using getters.*/
	
public class Room {
	private int roomId;
	private int floorNum;
	private String seatCapacity;
	
	public void setroomId(int i) {
		roomId=i;
	}
	
	public int getroomId() {
		return roomId;
	}
	
	
	public void setfloorNum(int n) {
		floorNum=n;
	}

	public int getfloorNum() {
		return floorNum;
	}
		
	
	public void setseatCapacity(String c) {
		seatCapacity=c;
	}
	
		public String getseatCapacity() {
			return seatCapacity;
		}
		
	public void display() {
		System.out.println("roomId:" +roomId);
		System.out.println("floorNum:" +floorNum);
		System.out.println("seatCapacity:" +seatCapacity);
	}
	

}
