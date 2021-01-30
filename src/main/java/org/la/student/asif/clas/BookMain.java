package org.la.student.asif.clas;

public class BookMain {

	public static void main(String[] args) {

		Book book = new Book();
		
		book.setValues(55.3, "jamil", 44, 12);
		
		book.setAuthor("naaz");
		System.out.println("author: "+book.getAuthor());
		
		//book.display();
		
		int age = book.getAge();
		
		if(age<18) {
			System.out.println("kid");
		}
		else if(age>=18) {
			System.out.println("adult");
		}
		
	}

}
