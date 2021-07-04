package org.la.student.rasheed.clas;


/*
 * Create a class Orders having member variables id, userId, status, createdAt. create getters and 
		setters for all member variables. 
		Create object of Orders class in other class inside main method
		and set all member values and print all member values using getters.
 */
public class Orders {
	
	
	private  int Id;
	private int userId;
	private String status;
	private String createdAt;
	
	
	
	public int getId() {
		return Id;
	}
	public int getuserId() {
		return userId;
	}
	public String getstatus() {
		return status;
	}
	public String getcreatedAt() {
		return createdAt;
	}
	
	public void setId(int i) {
		Id = i;
	}
	public void setuserId(int u ) {
		userId = u;
	}
	public void setstatus(String s) {
		status = s;
	}
	public void setcreatedAt(String  c) {
		createdAt = c;
	}
	public void display() {
		System.out.println("Id : "+Id+" User Id : "+userId+" Status : "+status+" Created At : "+createdAt);
	}
	
	
	
	}
	
	


