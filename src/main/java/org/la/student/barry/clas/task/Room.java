package org.la.student.barry.clas.task;

public class Room {
	/*
	 * 	Create a class Room having member variables roomId, floorNum, seatCapacity. create getters and 
		setters for all member variables. Create object of Room class in other class inside main method
		and set all member values and print all member values using getters.
	
	 */

	private int roomId;
	private int floorNum;
	private int seatCapacity;
	
  public int getRoomId() {
	  return roomId;
  }
    public void setRoomId(int i) {
    	roomId=i;
    }
    public int getFloorNum() {
  	  return floorNum;
    }
      public void setFloorNum(int j) {
        floorNum =j;
        }
      	 public int getSeatCapacity() { 
      
      		  return seatCapacity;
      		  
      	  }
      	    public void setSeatCapacity(int k) {
      	    	seatCapacity=k;
      	    }
      	    	public void dispalay() {
      	    		System.out.println("RoomId: " +roomId+"    FloorNum:   "+floorNum+"   SeatCapacity: "+seatCapacity);
      	    	}
}
