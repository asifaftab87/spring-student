package org.la.student.noura.clas;

public class BookMain {

	public static void main(String[] args) {
		

		Book book=new Book();
		System.out.println("book: "+book);//will print the address of our object
		
		book.setValues(33.5, "noura", 50, 34);
		
		book.setAuthor("Maha");
	    System.out.println("auther :"+book.getAuthor());

	    book.display();

		int age=book.getAge();
		
		if (age<18) {
			System.out.println("kid");
		}
		else if(age >18){System.out.println("adult");}
				
				
			
			
		
	}

}
