package org.la.student.tahir.jdbc.model;

import java.io.Serializable;

public class City implements Serializable  {

	private static final long serialVersionUID = -8545901547885450379L;
	
	private int id;
	private String city;
	
public int getId() {
	
	return id;
}

public void setId(int id) {
	
	this.id =id;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	
	this.city = city;
}

public String toString() {
	
	return "Id:"+ id + "City:" + city;
}
}