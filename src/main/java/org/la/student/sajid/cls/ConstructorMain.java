package org.la.student.sajid.cls;

public class ConstructorMain {
	public static void main(String[] args) {
		Constructor con = new Constructor();  // automatic calling student class
		con.display();
		Constructor con1 = new Constructor(2,"sajid", "gmail.com",852); //Parameterized constructor
		con1.display();
		
	}

}
