package org.la.student.tahir.clas;

public class CityMain {

	public static void main(String[] args) {
		City c = new City();
		City c1 = new City("Musa", "Nigeria");
		c.setName("Tahir");
		c.setCountry("Nigeria");
		c.show();
		c1.setValues("Musa", "India");
		c1.show();
	}

}
