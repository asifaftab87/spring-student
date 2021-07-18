package org.la.student.asif.util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.la.student.asif.model.School;
import org.la.student.asif.model.Student;

public class UtilClass {

	public static School getSchoolNull() {
		return null;
	}
	
	public static List<Student> getAllStudent(){
		Student student1 = new Student(1, "wahed", 1);
		Student student2 = new Student(2, "primary", 2);
		Student student3 = new Student(3, "md jan", 3);
		List<Student> studentList = Arrays.asList(student1, student2, student3);
		return studentList;
	}
	
	public static List<Integer> getListInteger(){
		return Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8 , 9, 0);
	}
	
	public static List<String> getListString(){
		return Arrays.asList("mohit", "anil", "sharif", "amin", "noor", "moin", "mehdi", "hasan");
	}
	
	public static IntStream getStreamInt(){
		return Arrays.stream(new int[]{2, 4, 6, 8, 10});
	}
}
