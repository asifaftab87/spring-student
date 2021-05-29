package org.la.student.nizaam.methods;

public class Q20percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int maths=98,english = 83, telugu=85,hindi=90,science=93,social=92;
		System.out.println(percentage(maths,english,telugu,hindi,science,social));
	}
	
	static double percentage(int a, int b,int c,int d,int e, int f) {
		return (a+b+c+d+e+f)/6;
	}

}
