package org.la.student.bakil.objects;

public class OptionTableMain {

	public static void main(String[] args) {

		
		OptionTable option = new OptionTable ();
			
			option.setId(9862872);
			option.setOptionName("Any name ");
			
			int id = option.getId();
			String optionName = option.getOtionName();
			
			System.out.println("Id :"+id);
			System.out.println("Option name"+optionName);
	}

}
