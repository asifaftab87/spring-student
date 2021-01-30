package org.la.student.asif.clas;

public class Book {
	private double price;
	private String author;
	private int numPages;
	private int age;
	
	public void setAuthor(String a) {		//setters
		author = a;
	}
	public String getAuthor() {				//getters
		return author;
	}
	
	public void display() {
		System.out.println("price: "+price);
		System.out.println("author: "+author);
		System.out.println("numPages: "+numPages);
		System.out.println("age: "+age);
	}
	public void setValues(double pr, String auth, int np, int a) {
		price = pr;
		author = auth;
		numPages = np;
		age = a;
	}
	
	public int getAge() {		//getters
		return age;
	}
	
}
