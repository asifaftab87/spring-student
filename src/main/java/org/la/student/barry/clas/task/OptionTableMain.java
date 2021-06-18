package org.la.student.barry.clas.task;

public class OptionTableMain {

	public static void main(String[] args) {
		OptionTable optionTable= new OptionTable();
		optionTable.setId(7);
		optionTable.setOptionName("Science");
		
		int id= optionTable.getId();
		String optionName= optionTable.getOptionName();
		
		System.out.println("Id: "+id);
		System.out.println("OptionName: "+optionName);

	}

}
