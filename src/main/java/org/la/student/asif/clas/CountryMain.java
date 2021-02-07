package org.la.student.asif.clas;

public class CountryMain {

	public static void main(String[] args) {
		
		//Country.name = "Malaysia";
		//Country.statMethod();
		
		Country country1 = new Country();
		Country country2 = new Country();
		Country country3 = new Country();
		
		country1.code = "c1";
		country2.code = "c2";
		country3.code = "c3";
		
		country1.name = "n1";
		country2.name = "n2";
		country3.name = "n3";
		
		System.out.println("country1.code: "+country1.code);
		System.out.println("country2.code: "+country2.code);
		System.out.println("country3.code: "+country3.code);
		
		System.out.println("country1.name: "+country1.name);
		System.out.println("country2.name: "+country2.name);
		System.out.println("country3.name: "+country3.name);
	}
}
