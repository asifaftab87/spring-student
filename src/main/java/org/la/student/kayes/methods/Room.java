package org.la.student.kayes.methods;

public class Room {
	private int roomId;
	private int floorNum;
	private int seatCapacity;
	
	public int getroomId()
	{
		return roomId;
	}
	public int getfloorNum()
	{
		
		return floorNum;
	}
	public int getseat()
	{
		return seatCapacity;
	}

	

	public void setroomId(int i)
	{
		roomId=i;
	}
	
	public void setfloorNum(int j)
	{
		floorNum=j;
	}
	public void setseat(int k)
	{
		seatCapacity=k;
	}
}
