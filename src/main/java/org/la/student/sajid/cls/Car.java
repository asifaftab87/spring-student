package org.la.student.sajid.cls;

public class Car {
	public double price;	//member variable
	public String carName;
	public String color;
	
	public void setValue(double pr,String cn,String clr) {
		price=pr;
		carName=cn;
		color=clr;
	}
	
	public void display() {
		System.out.println("Car Price: $ "+price);
		System.out.println("Car Name: "+carName);
		System.out.println("Car Color: "+color);
	}

}
