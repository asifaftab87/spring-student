package org.la.student.bakil.objects;
/*
 * Create a class Room having member variables roomId, floorNum, seatCapacity. create getters and 
		setters for all member variables. Create object of Room class in other class inside main method
		and set all member values and print all member values using getters.
 */
public class Room {

	private int roomId;
	private int floorNum;
	private int setCapacity;
	


	//Room Id
public void setroomId(int i) {
	roomId=i;
}
public int getroomId() {
	return roomId;
}

   //Floor Num
public void setfloorNum(int f) {
	floorNum=f;
}
public int getfloorNum() {
	return floorNum;
}

    //Set Capacity
public void setsetCapacity(int s) {
	setCapacity=s;
}
public int getsetCapacity() {
	return setCapacity;
}


public void display() {
	System.out.println("Room Id :"+roomId+"Floor number :"+floorNum+"Set capacity :"+setCapacity);

}
}