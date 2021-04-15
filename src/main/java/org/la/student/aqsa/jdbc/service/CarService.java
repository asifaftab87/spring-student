package org.la.student.aqsa.jdbc.service;

import java.util.List;

import org.la.student.aqsa.jdbc.model.Car;
import org.la.student.aqsa.jdbc.repository.CarRepository;
public class CarService {
	public CarService() {
		CarRepository.connectionOpen();
	}

	public List<Car> findAll() {
		List<Car> ls = CarRepository.findAll();
		
		return ls;
	}
	public Car findById(int id){
		
		return CarRepository.findById(1);
	}
	
	public void create(Car car) {
		CarRepository.create(car);
		
		
	}

	public Car findByModel(String model) {
		
		return CarRepository.findByModel(model);
	}

	
	public List<Car> findByColor(String color) {
		List<Car> ls =  CarRepository.findByColor(color);
		return ls;
		
		
	}
	
}
