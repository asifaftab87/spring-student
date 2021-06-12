package org.la.student.barry.clas.task;

public class OptionValuesMain {

	public static void main(String[] args) {
		OptionValues optionValues= new OptionValues();
		optionValues.setVariablesId(3);
		optionValues.setOptionId(333);
		optionValues.setValueName("Product one");
		
		int variablesId= optionValues.getVariablesId();
		int optionId= optionValues.getOptionId();
		String valueName= optionValues.getValueName();
		
		System.out.println("VariablesId: "+variablesId);
        System.out.println("OptionId: "+optionId); 
        System.out.println("ValueName: "+valueName);
	}

}
