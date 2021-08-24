package org.la.student.sajid.cls;

public class CityMain {

	public static void main(String[] args) {
		City city=new City();
		city.setCityName("delhi");
		city.setCountry("India");
		city.show();
		City city1=new City("Bihar","India");
		city1.show();

	}

}
