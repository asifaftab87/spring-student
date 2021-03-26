package org.la.student.tahir.model;

public class Car {
/*create a model class Car having fields CarId, model, company, engine, color, type
create a dto class CarDto having fields CarId, model, company, engine, color, type
copy from model to dto class manually as well as automatically using dozerbeanmapper class and print.*/
	
	private int CarId, model;
	private String company, engine, color, type;
	
	public int getCarId() {
		
		return CarId;
	}
	
	public void setCarId( int CarId) {
		
		this.CarId = CarId;
	}
	
	public int getModel() {
		return model;
	}
	
	public void setModel(int model) {
		
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
	
	public void setColor( String color) {
		
		this.color = color;
	}
	
	public String getType() {
		
		return type;
	}
	
	public void setType( String type) {
		
		this.type = type;
	}
	
}
