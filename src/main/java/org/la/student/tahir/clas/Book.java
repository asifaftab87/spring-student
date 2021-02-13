package org.la.student.tahir.clas;

public class Book {

	private double price;
	private String authorname;
	private int numpages;
	private int age;
	
	public void display() {
		
		System.out.println("Price" + price);
		System.out.println("Author Name:"+ authorname );
		System.out.println("Number of pages: " + numpages);
		System.out.println("Age : " + age);
	}
	
	public void setValues(double a, String b, int c, int d) {
			
			price = a;
			authorname = b;
			numpages = c;	
			age = d;
	}
	
	public int getAge() {
		return age;
	}
	

	public double getPrice() {
		return price;
	}
	
	

	
}
