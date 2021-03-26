package org.la.student.tahir.dto;

public class CarDto {
	
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
	
	public String toString() {
		
		return "CarId:"+CarId +" Model:"+ model+ " Company:"+ company + " Engine:" + engine +" Color:"+ color  +" Type:"+ type;
	}

}
