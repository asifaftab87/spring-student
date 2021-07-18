package org.la.student.asif.excptn;

import org.la.student.asif.model.School;
import org.la.student.asif.util.UtilClass;

public class ArithmeticExample4 {

	public static void main(String[] args) {
		
		System.out.println("start");
		try {
			School school = UtilClass.getSchoolNull();
			if(school!=null) {
				System.out.println("i: "+school.getAddress());
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("This will execute always");
		}
		System.out.println("end");
		
	}
}
