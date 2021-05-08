package org.la.student.kayes.condition;

public class Smallest3 {

	public static void main(String[] args) {
		int a=15;
		int b=80;
		int c=100;
		if(a<b && a<c)
			System.out.println("the number" +a+ "is smallest than" +b+ "and" +c);
		if(b<a && b<c)
			System.out.println("the number" +b+ "is smallest than" +a+ "and" +c);
		if(c<a && c<b)
			System.out.println("the number" +c+ "is smallest than" +a+ "and" +b);


	}

}
