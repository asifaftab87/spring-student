package org.la.student.tania_task1_pract_Relational_Operator;

public class Question_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 3;
		boolean x = a++==10 && ++b==4;
		boolean y = --a==10 || b--<4;
		System.out.println("a= " +a);
		System.out.println("b=" +b);
        System.out.println("x=" +x);
        System.out.println("y= " +y);
        
	}

}