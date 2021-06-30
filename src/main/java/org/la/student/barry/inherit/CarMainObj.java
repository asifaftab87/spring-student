package org.la.student.barry.inherit;

public class CarMainObj {

	public static void main(String[] args) {
		
		Car c= new SportCar();
		c.myCar();
		// any extra method in child is inaccessible using this way 
		// c.twoSeters();

	}

}
