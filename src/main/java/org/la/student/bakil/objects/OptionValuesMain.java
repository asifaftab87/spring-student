package org.la.student.bakil.objects;

public class OptionValuesMain {

	public static void main(String[] args) {

		OptionValues value  = new OptionValues();
		
		value.setid(52752);
		value.setOptionId(887772);
		value.setValueName("WRRT");
		
		int id = value.getId();
		int optionId = value.getOptinId();
		String valueName = value.getValueName();
		
		System.out.println("Id :"+id);
		System.out.println("Option id :"+optionId);
		System.out.println("Value name :"+valueName);
	}

}
