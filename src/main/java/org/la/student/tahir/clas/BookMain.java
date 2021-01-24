package org.la.student.tahir.clas;

public class BookMain {

	public static void main(String[] args) {
		Book book = new Book();
		//book.display();
		book.setValues(1000, "Musa", 122, 13);
		book.display();
		
		
		double boook = book.getPrice();
		System.out.println(boook);
		
		book.display();
		
		int age = book.getAge();
		System.out.println(age);
		
		

}
	}
