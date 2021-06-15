package org.la.student.barry.clas.task;

public class CountriesMain {

	public static void main(String[] args) {
		Countries countries= new Countries();
		countries.setName("Malaysia");
		countries.setCode(67000);
		countries.setContinentName("Asia");
		
		int code= countries.getCode();
		String name= countries.getName();
		String continentName=countries.getContinentName();
		
		System.out.println("By Using The Getter");
		
		
		System.out.println("Code: "+code);
		System.out.println("Name: "+name);
		System.out.println("ContinentName: "+ continentName);
		
		
		
		

	}

}
