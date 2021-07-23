package org.la.student.barry.stream;

import java.util.List;

import org.la.student.barry.model.Student;
import org.la.student.barry.util.UtilClass;

public class StreamExample {
	public static void main(String[] args) {
		List<Student> studentList= UtilClass.getAllStudent();
		studentList.stream().forEach(x->  System.out.println(x));
		
		
		
	}

}
