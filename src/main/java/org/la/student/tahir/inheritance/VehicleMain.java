package org.la.student.tahir.inheritance;

public class VehicleMain {

	public static void main(String[] args) {
	
		Vehicle vehicle = new Bike();
		Build.print(vehicle);
		
		vehicle = new Car();
		Build.print(vehicle);
	}

}
