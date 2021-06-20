package org.la.student.asif.clas;

public class DeveloperMain {

	public static void main(String[] args) {
		
		Developer developer = new Developer();
		developer.set(1, "jawed", "java");
		developer.display();
		developer.name = "nawaz";
		developer.display();
	}
}
