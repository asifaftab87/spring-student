package org.la.student.bakil.objects;

public class PatternMain {

	public static void main(String[] args) {
		
		Pattern pattern = new Pattern();
		
		pattern.setId(88662);
		pattern.setOptionName("SRTW");
		
		int id = pattern.getId();
		String optionName= pattern.getOptionName();
		
		System.out.println("Id :"+id);
		System.out.println("Option name :"+optionName);
	}
}
