package org.la.student.barry.clas.task;

public class OptionValues {
	/*
	 * Create a class OptionValues having member variables id, optionId, valueName. 
	 * create getters and setters for all member variables. Create object of OptionValue
	 *  class in other class inside main method and set all member values and print all member values 
	 *  using getters.
	 */

	private int variablesId, optionId;
	private String valueName;
	
	public int getVariablesId() {
		return variablesId;
	}
	
	public void setVariablesId(int i) {
		variablesId=i;
	}

	public int getOptionId() {
		return optionId;
	}
	
	public void setOptionId(int j) {
		optionId=j;
	}

	public String getValueName() {
		return valueName;
	}
	
	public void setValueName(String v) {
		valueName=v;
	}
}
