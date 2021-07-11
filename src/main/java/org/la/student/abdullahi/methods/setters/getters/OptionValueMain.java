package org.la.student.abdullahi.methods.setters.getters;

public class OptionValueMain {

	public static void main(String[]args) {
		
		OptionValue b =new OptionValue();
		b.setId(01);
		b.setOptionId("Toyota");
		b.setValueName("High");
		
		int Id= b.getId();
		String OptionId = b.getOptionId();
		String ValueName = b.getValueName();
		
		
		System.out.println("Id = " +Id);
		System.out.println("Option Id = " +OptionId);
		System.out.println("Value Name = "+ ValueName);
	
		
		
		
	}
}