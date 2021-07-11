package org.la.student.abdullahi.methods.setters.getters;

public class BrandsMain {

	public static void main(String[]args) {
		
		Brands b =new Brands();
		b.setId(01);
		b.setBrandName("Toyota");
		b.setThombnails("---");
		
		int Id= b.getId();
		String BrandName = b.getBrandName();
		String Thombnails = b.getThombnails();
		
		System.out.println("Id = " +Id);
		System.out.println("Brands Name = " +BrandName);
		System.out.println("Thombnails = " +Thombnails);
		
		
		
	}
}