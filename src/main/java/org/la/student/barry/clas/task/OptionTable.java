package org.la.student.barry.clas.task;

public class OptionTable {
	/*
	 * 25.	Create a class OptionTable having member variables id, optionName. 
	 *create getters and setters for all member variables. 
	 *Create object of OptionTable class in other class inside main method and set all member values
	 * and print all member values using getters.
	 */
	private int id;
	private String optionName;
   
	public int getId() {
		return id;
	}
	public void setId(int i) {
		id=i;
	}
	public String getOptionName() {
		return optionName;
	}
	public void setOptionName(String n) {
		optionName=n;
	}
}
