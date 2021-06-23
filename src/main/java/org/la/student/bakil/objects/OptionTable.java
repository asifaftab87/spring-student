package org.la.student.bakil.objects;
/*
 * Create a class OptionTable having member variables id, optionName. create getters and setters for all member variables. 
   Create object of OptionTable class in other class inside main method and 
   set all member values and print all member values using getters.
 */
public class OptionTable {

	
	private int id;
	private String optionName;
	
	// Id 
	public void setId(int i) {
		id=i;
	}
	public int getId() {
		return id;
	}
	
	//Option name 
	
	public void setOptionName(String o) {
		optionName=o;
	}
	public String getOtionName() {
		return optionName;
	}
	
	public void display () {
		System.out.println("Id :"+id +"Option name :"+optionName);
	}
}
