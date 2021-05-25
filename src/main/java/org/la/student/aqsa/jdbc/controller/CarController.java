package org.la.student.aqsa.jdbc.controller;


import java.util.List;

import org.la.student.aqsa.jdbc.model.Car;
import org.la.student.aqsa.jdbc.service.CarService;

public class CarController {
	
	CarService carService = null;
	
	public CarController() {
		carService = new CarService();
	}
	
	public static void main(String[] args) {
		
		CarController carC = new CarController();
		carC.addEmployee();
		carC.findAll();
		carC.findById(1);
		carC.findByModel("SMALL");
		carC.findByColor("Red");
	}
	

public void addEmployee(){
	
	System.out.println("----------------Adding Employee------------");
	Car car = new Car();
	car.setCarId(1);
	car.setModel("BIG");
	car.setEngine("Something");
	car.setCompany("YAMAHA");
	car.setColor("Red");
	car.setType("2 Wheeler");
	
	carService.create(car);
	
	car.setCarId(2);
	car.setModel("BIG");
	car.setEngine("Something");
	car.setCompany("YAMAHA");
	car.setColor("Red");
	car.setType("2 Wheeler");
	
	carService.create(car);
	
	car.setCarId(3);
	car.setModel("BIGGER");
	car.setEngine("Something");
	car.setCompany("SUZUKI");
	car.setColor("WHITE");
	car.setType("3 Wheeler");
	
	carService.create(car);
	
	
}
public void findAll(){
	
	System.out.println("----------find all--------------");
	
	List<Car> carList = carService.findAll();
	System.out.println(carList);
}

public void findById(int id) {
	Car car = carService.findById(id);
	System.out.println("Car: "+car);
}

public void findByModel(String model) {
	Car car = carService.findByModel(model);
	System.out.print("Car: "+car);
}
public List<Car> findByColor(String color) {
	 List<Car> ls = carService.findByColor(color);
	return ls;
}

}
