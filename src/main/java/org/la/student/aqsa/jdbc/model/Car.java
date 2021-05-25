package org.la.student.aqsa.jdbc.model;

import java.io.Serializable;

public class Car implements Serializable {
	
	private static final long serialVersionUID = -8545901547885450379L;
	private int carId;
	private String model,company,engine,color,type;
	
	public Car() {
		
	}
	
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId=carId;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	public String toString() {
		return carId+" "+model+" "+company+" "+engine+" "+color+" "+type;
		
	}

}
