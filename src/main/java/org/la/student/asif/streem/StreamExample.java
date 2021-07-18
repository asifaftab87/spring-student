package org.la.student.asif.streem;

import java.util.List;

import org.la.student.asif.model.Student;
import org.la.student.asif.util.UtilClass;

public class StreamExample {

	public static void main(String[] args) {
		
		List<Student> studentList = UtilClass.getAllStudent();
		studentList.stream().forEach(x -> System.out.println(x)); 
	}
}
