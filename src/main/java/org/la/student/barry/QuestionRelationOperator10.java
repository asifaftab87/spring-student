package org.la.student.barry;

public class QuestionRelationOperator10 {
	 public static void main(String[] args) {
		    int a = 10;
			int b = 3;
			boolean x = a++==10 && ++b==4;
			boolean y = --a==10 || b--<4;
			System.out.println("a:" + a);
			System.out.println("b:"+ b);
			System.out.println("x:" + x);
			System.out.println("y:" + y);
	 }
}
