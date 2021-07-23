package org.la.student.barry.excption;

import java.util.List;

import org.la.student.barry.model.Student;
import org.la.student.barry.util.UtilClass;

public class StudentMapulation {
	
	public static void main(String[] args) {
		
		List<Student> studentList= UtilClass.getAllStudent();
		for(Student std : studentList) {
			System.out.println(std);
		}
		
	}

}
