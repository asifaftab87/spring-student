package org.la.student.barry.util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import org.la.student.barry.model.School;
import org.la.student.barry.model.Student;

public class UtilClass {
	
	public static  School getSchoolNull() {
		
		return null;
		
	}
	public static List<Student> getAllStudent(){
		Student student1 = new Student(1, "Alpha", "barry");
		Student student2 = new Student(2, "sacko", "Nouha");
		Student student3 = new Student(3, "Ansou", "beretee");
		
		List<Student> studentList = Arrays.asList(student1, student2,student3);
		return studentList;	
		
	}
	 public static List<Integer> getListInterger(){
		 return Arrays.asList(1, 2, 3, 4, 5 , 6, 7, 8 , 9 , 0 );
	 }
	 public static List<String> getListString(){
		 return Arrays.asList("mike", "abdoulaye", "sherif", "Sheikh", "bakill", "rashidd", "mohamed", "Ibrahim");
	 }
	 
	 public static IntStream getStreamInt(){
		 return Arrays.stream(new int[] {2,4, 6, 8, 10});
	 }

}
