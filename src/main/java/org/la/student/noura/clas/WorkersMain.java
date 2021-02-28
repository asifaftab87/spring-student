package org.la.student.noura.clas;

import org.la.student.noura.dto.Workers;

import org.la.student.noura.util.Information;

public class WorkersMain {

	public static void main(String[] args) {

		Workers w= new Workers(1,"nahed",5,5000.5,"saudi",'m');
		boolean isSaudi=Information.isSaudi(Workers.getNationality());
		System.out.println(isSaudi);
		
		String gender=Information.getGender('m');
		System.out.println(gender);

		
		
	}

}
