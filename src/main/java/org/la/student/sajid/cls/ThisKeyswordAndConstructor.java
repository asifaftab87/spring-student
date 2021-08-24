package org.la.student.sajid.cls;

public class ThisKeyswordAndConstructor {
	private String name;
	private String stateName;
	
	public ThisKeyswordAndConstructor() {
//		ThisKeyswordAndConstructor9(); con't called, 
		this("sajid ,", "bihar"); //constructor write first line
		System.out.println("Default constructor");
//		this("sajid", "bihar"); //error
	}
	public ThisKeyswordAndConstructor(String n,String m) {
		System.out.println("Perematerzied constructor");
		System.out.println(n+m);
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	

}
