package org.la.student.tahir.clas;

import org.la.student.asif.util.HelperClass;
//import org.la.student.asif.util.HelperClass;
import org.la.student.tahir.dto.Customer;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Customer cus = new Customer(90, "Tahir", 18, "Indian", 'm');
		
		boolean isIndian = HelperClass.isIndian(cus.getNationality());
		
				System.out.println(isIndian);
		
		String gender = HelperClass.getGender(cus.getGender());
				
				System.out.println(gender);
		boolean adult = HelperClass.isAdult(cus.getAge());
		
				System.out.println(adult);

	}

}
