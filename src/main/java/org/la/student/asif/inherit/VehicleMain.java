package org.la.student.asif.inherit;

public class VehicleMain {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Bus();	//tight coupling 
		Build.print(vehicle);
		
	}
}
