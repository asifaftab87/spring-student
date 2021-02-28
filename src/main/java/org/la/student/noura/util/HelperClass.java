package org.la.student.noura.util;

import org.la.student.noura.dto.Customer;

public class HelperClass {

	public static boolean isIndian(String nationality ) {
		return nationality.equalsIgnoreCase("indian");
	}
	public static boolean isAdult(int age) {
		return age>=18;
	}
	
	public static String getGender(char gender) {
		int compareGender = Character.compare(gender, 'm'); 
				if(compareGender==0) {
					return "male";
				}
		return "female";
	}
	
}
