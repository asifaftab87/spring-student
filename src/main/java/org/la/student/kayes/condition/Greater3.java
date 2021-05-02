package org.la.student.kayes.condition;

public class Greater3 {

	public static void main(String[] args) {
		int a=15;
		int b=80;
		int c=100;
		if(a>b && a>c)
			System.out.println("the number" +a+ "is greater than" +b+ "and" +c);
		if(b>a && b>c)
			System.out.println("the number" +b+ "is greater than" +a+ "and" +c);
		else
			System.out.println("the number" +c+ "is greater than" +a+ "and" +b);

	}

}
