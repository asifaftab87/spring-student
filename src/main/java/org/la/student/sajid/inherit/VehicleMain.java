package org.la.student.sajid.inherit;

public class VehicleMain {
	public static void main(String[] args) {
		
		Vehicle vehicle = new Bus();  //tightly coupling
		Build.print(vehicle);

		vehicle = new Car();
		Build.print(vehicle);
		
		vehicle = new Bike();
		Build.print(vehicle);

		// I Am not understanding

	}
}
