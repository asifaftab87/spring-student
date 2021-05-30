package org.la.student.noor;
/*double percent(int, int, int, int, int)
		suppose 5 arguments are marks in subjects, each subject is of 100 marks,
		find percentage and return result*/

public class MethodQ20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maths=88,english = 80,hindi=90,science=66,computer=70;
		System.out.println(percentage(maths,english,hindi,science,computer));
	}

	static double percentage(int a, int b,int c,int d,int e) {
		return (a+b+c+d+e)/5;
	}
}
