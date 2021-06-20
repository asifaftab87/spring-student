package org.la.student.rasheed.method;
/*
 * double percent(int, int, int, int, int)
		suppose 5 arguments are marks in subjects, each subject is of 100 marks,
 */

public class MethodTask20 {

	public static void main(String[] args) {
		
		int Agriculture =80, English =78, Maths =81, Biology =90, Chemistry =92;
		System.out.println(percentage(Agriculture, English, Maths, Biology, Chemistry));
		
	}
	
	static double percentage(int a, int b, int c, int d, int e) {
		return (a+b+c+d+e)/5;
	}


}
