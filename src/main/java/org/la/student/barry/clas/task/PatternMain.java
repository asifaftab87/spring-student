package org.la.student.barry.clas.task;

public class PatternMain {

	public static void main(String[] args) {
		Pattern pattern= new Pattern();
		pattern.setId(2);
		pattern.setOptionName("Programming in Java");
		
		int id= pattern.getId();
		String optionName= pattern.getOptionName();
		System.out.println("........Display Pattern by using getters........ ");
		System.out.println("id: "+id);
		System.out.println("OptionName: "+optionName);
		
	}

}
