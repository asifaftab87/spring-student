package org.la.student.tahir.mapper;

import org.la.student.tahir.dto.CarDto;
import org.la.student.tahir.model.Car;

public class CarMain {

	public static void main(String[] args) {
	
		Car car = new Car();
		
		car.setCarId(12303);
		car.setCompany("Toyota");
		car.setType("Saloon");
		car.setModel(2020);
		car.setColor("Green");
		car.setEngine("AE0534");
		
		
		CarMain main = new CarMain();
		
		System.out.println(main.CarToCarDto(car));
		
		
		

	}
	
	public CarDto CarToCarDto(Car car) {
		
		CarDto dto = new CarDto();
		
		dto.setCarId(car.getCarId());
		dto.setCompany(car.getCompany());
		dto.setType(car.getType());
		dto.setModel(car.getModel());
		dto.setColor(car.getColor());
		dto.setEngine(car.getEngine());
		
		
		return dto;
	}

}
