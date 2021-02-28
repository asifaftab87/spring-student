package org.la.student.noura.clas;

import org.la.student.noura.dto.Customer;
import org.la.student.noura.util.HelperClass;

public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer customer =new Customer(2,"noha",20,"saudi",'f');
		boolean isIndian=HelperClass.isIndian(customer.getNationality());
		System.out.println(isIndian);
		
		String gender=HelperClass.getGender('m');
		System.out.println(gender);

		boolean adult=HelperClass.isAdult(customer.getAge());
		System.out.println(adult);
	}

}
