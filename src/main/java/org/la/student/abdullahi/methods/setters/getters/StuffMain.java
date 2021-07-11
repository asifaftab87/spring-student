package org.la.student.abdullahi.methods.setters.getters;

public class StuffMain {

	public static void main(String[]args) {
		
		Stuff s =new Stuff();
		s.setId(01);
		s.setStuffName("Toyota");
		s.setThombnails("---");
		
		int Id= s.getId();
		String StuffName = s.getStuffName();
		String Thombnails = s.getThombnails();
		
		System.out.println("Id = " +Id);
		System.out.println("Stuff Name = " +StuffName);
		System.out.println("Thombnails = " +Thombnails);
		
		
		
	}
}