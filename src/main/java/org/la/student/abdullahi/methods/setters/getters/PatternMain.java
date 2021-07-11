package org.la.student.abdullahi.methods.setters.getters;

public class PatternMain {

	public static void main(String[]args) {
		
		Pattern b =new Pattern();
		b.setId(01);
		b.setOptionName("Toyota");
	
		
		int Id= b.getId();
		String OptionName = b.getOptionName();
		
		
		System.out.println("Id = " +Id);
		System.out.println("Option Name = " +OptionName);
		
		
		
		
	}
}