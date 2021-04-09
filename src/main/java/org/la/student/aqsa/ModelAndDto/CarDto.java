package org.la.student.aqsa.ModelAndDto;

public class CarDto {
	private int CarId;
	private String model, company, engine, color, type;
	
	public int getCarId() {
		return CarId;
	}
	public void setCarId(int carId) {
		CarId = carId;
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
		return CarId+" " + model+" " +company+" " +engine+" " +color+" " +type;
	}
}
