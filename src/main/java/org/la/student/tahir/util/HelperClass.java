package org.la.student.tahir.util;

public class HelperClass {

	public static boolean isIndian(String nationality) {
		
		return nationality.equalsIgnoreCase("Indian");
	}
	
	public static boolean isAdult(int age) {
		
		return age>=18;
	}
	
	public static String getGender(char gender) {
		
		int comparegender = Character.compare(gender, 'm');
		
		if (comparegender == 0)
			return "Male";
					
			else
				return "Female";
	}
}
