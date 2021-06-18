package org.la.student.barry.clas.task;

public class Orders {
	/*
	 * Create a class Orders having member variables id, userId, status, createdAt. create getters and 
		setters for all member variables. Create object of Orders class in other class inside main method
		and set all member values and print all member values using getters.
	 */

	private int id;
	private int userId;
	private String status;
	
	public int getId() {
	
		return id;
	}
	public void setId(int i) {
		id=i;
	}
	public int getUserId() {
		
		return userId;
	}
	public void setUserId(int j) {
		userId=j;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String s) {
		status=s;
	}
}
