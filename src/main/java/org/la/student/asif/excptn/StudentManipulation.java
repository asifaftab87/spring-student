package org.la.student.asif.excptn;

import java.util.List;

import org.la.student.asif.model.Student;
import org.la.student.asif.util.UtilClass;

public class StudentManipulation {

	public static void main(String[] args) {
		
		List<Student> studentList = UtilClass.getAllStudent();
		for(Student std : studentList) {
			System.out.println(std);
		}
	}
}
