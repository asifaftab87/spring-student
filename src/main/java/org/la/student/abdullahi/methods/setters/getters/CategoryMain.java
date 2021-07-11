package org.la.student.abdullahi.methods.setters.getters;

public class CategoryMain {

	public static void main(String[]args) {
		
		category b =new category();
		b.setId(01);
		b.setcategoryName("Toyota");
		b.setThombnails("---");
		
		int Id= b.getId();
		String categoryName = b.getcategoryName();
		String Thombnails = b.getThombnails();
		
		System.out.println("Id = " +Id);
		System.out.println("Brands Name = " +categoryName);
		System.out.println("Thombnails = " +Thombnails);
		
		
		
	}
}