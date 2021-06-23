package org.la.student.bakil.objects;
/*
 * Create a class Orders having member variables id, userId, status, createdAt. create getters and 
   setters for all member variables. Create object of Orders class in other class inside main method
	and set all member values and print all member values using getters.
 */
public class Orders {

	private int id;
	private int userId;
	private String status;
	private String createdAt;
	
	
	public void setId(int i) {
		id=i;
	}
	public int getId() {
		return id;
	}
	
	public void setUserId(int u) {
		userId=u;
	}
	public int getUserId() {
		return userId;
	}
	
	public void setStatus (String s) {
		status=s;
	}
	public String getStatus() {
		return status;
	}
	
	public void setcreatedAt(String a) {
		createdAt=a;
	}
	public String getcreatedAt() {
		return createdAt;
	}
	
	public void display () {
		System.out.println("Id :"+id+"User id :"+userId+"Status :"+status+"Created at :"+createdAt);
	}
}
