package org.la.student.tahir.clas;

public class CountryMain {

	public static void main(String[] args) {
		
		//
		Country.statMethod();
	
		Country c = new Country();
		Country c1 = new Country();
		Country c2 = new Country();
		
		c.instanceMethod();
		
		c.name="Tahir";
		c1.name= "Usman";
		c2.name= "Aminu";
		c.code= "1";
		c1.code="2";
		c2.code="3";
		
		System.out.println("C.name: " +c.name);
		System.out.println("C1.name: " +c1.name);
		System.out.println("C2.name: " +c2.name);
		
		System.out.println("C.code: "+ c.code);
		System.out.println("C1.code: "+ c1.code);
		System.out.println("C2.code: "+ c2.code);

	}

}
