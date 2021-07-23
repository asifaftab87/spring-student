package org.la.student.barry.excption;

import org.la.student.barry.model.School;
import org.la.student.barry.util.UtilClass;

public class ArithmeticExample4 {

	public static void main(String[] args) {
	 
		System.out.println("Start");
		try {
		School school = UtilClass.getSchoolNull();
		if(school!=null) {
		System.out.println("i: "+school.getAddress());
		  }
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("This will excecute always");
		}
		
		System.out.println("end");
	}

}
