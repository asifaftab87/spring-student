package org.la.student.noura.util;

public class Information {
	
	
	public static boolean isSaudi(String nationality ) {
		return nationality.equalsIgnoreCase("indian");
	}
	
	
	public static String getGender(char gender) {
		int compareGender = Character.compare(gender, 'm'); 
				if(compareGender==0) {
					return "male";
				}
		return "female";
	}

}
