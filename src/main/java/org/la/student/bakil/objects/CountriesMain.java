package org.la.student.bakil.objects;

public class CountriesMain {

	public static void main(String[] args) {

		Countries countries = new Countries();
		
		countries .setCode("HT1211");
		countries.setName("Yemen");
		countries .setContinentName("Asia");
		
		String code = countries.getCode();
		String name = countries.getName();
		String continentName =countries.getContinentName();
		
		System.out.println("Code :"+code);
		System.out.println("Name :"+name);
		System.out.println("Continent name :"+continentName);

	}

}
