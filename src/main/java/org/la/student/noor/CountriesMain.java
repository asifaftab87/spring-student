package org.la.student.noor;

public class CountriesMain {

	public static void main(String[] args) {
		Countries countries= new Countries();
		countries.setName("India");
		countries.setCode(10101);
		countries.setContinentName("Maharashtra");

		int code= countries.getCode();
		String name= countries.getName();
		String continentName=countries.getContinentName();


		System.out.println("Code: "+countries.getCode());
		System.out.println("Name: "+countries.getName());
		System.out.println("ContinentName: "+countries.getContinentName());





	}

	}


