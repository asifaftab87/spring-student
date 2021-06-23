package org.la.student.bakil.objects;
/*
 * Create a class OptionValues having member variables id, optionId, valueName. create getters and setters for all member variables. 
   Create object of OptionValues class in other class inside main method and set all member values and
    print all member values using getters.
	
 */
public class OptionValues {

	
	private int id ;
	private int optionId;
	private String valueName;
	
	//Id 
	public void setid(int i) {
		id =i;
	}
	public int getId() {
		return id;
	}
	
	// Option id 
	public void setOptionId(int p) {
		optionId=p;
	}
	public int getOptinId() {
		return id;
	}
	
	// Value name 
	public void setValueName(String n) {
		valueName=n;
	}
	public String getValueName() {
		return valueName;
	}
	
	public void display() {
		System.out.println("Id :"+id +"Option id :"+optionId+"Value name :"+valueName);
	}
}
