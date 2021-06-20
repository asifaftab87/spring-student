package org.la.student.rasheed.clas;

public class AccesSpecifier {

	private int id;
	public String name;
	
	
	public void display() {
		//System.out.println("display() --id:  "+id+" name: "+name);
	
		print();
	
	

	}
	public void set (int i, String n) {
		id = i;
		name = n;
		
	}
	
	private void print () {
	System.out.println("print() -- id: "+id+" name: "+name);
	
}
}
