package org.la.student.asif.clas;

import org.la.student.asif.dto.Customer;
import org.la.student.asif.util.HelperClass;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Customer customer = new Customer(1, "kalim", 19, "nepal", 'm');
		
		boolean isIndian = HelperClass.isIndian(customer.getNationality());
		
		System.out.println("is Indian: "+isIndian);
		
		String gender = HelperClass.getGender('f');
		System.out.println("gender: "+gender);
	
		boolean adult = HelperClass.isAdult(customer.getAge());
		System.out.println("is customer adult: "+adult);
	}
}
