package org.la.student.tahir.inheritance;

public class Shape {

	public Shape(){
		System.out.println("Default constructor of Shape class");
	}
	
	public Shape(int id){
		System.out.println("Parametized constructor of Shape class, id= " + id);
	}
	
	public void Draw() {
		
		System.out.println("Draw method of shape class");
	}
}
