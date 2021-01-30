package org.la.student.noura.clas;

public class Book {
	
	public double price;// member variable will visible inside the whole class and will be usable by all methods 
	private String author;
	public int numPage;
	private int age;
	
	
	public void setAuthor(String aut) {//setter***
		author =aut;
	}
	
	public String getAuthor() {//getter***
		return author;
	}
	
	public void display() { //this method to print the value of all member variable
		int i =5; //member method
		System.out.println("price: "+price);
		System.out.println("numPage: "+numPage);
		System.out.println("author: "+author);
		System.out.println("age: "+age);

	}
	
	
	
	public void setValues(double pr, String auth, int np, int a) {//passing values and assigning it to our member variables

		price=pr;
		author=auth;
		numPage=np;
		age=a;
	}
	
	 public int getAge() {//getters***  "read the value " so we use return but not accept 
		 return age;
	 }

	 
}
