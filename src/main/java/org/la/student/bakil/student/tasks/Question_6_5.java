package org.la.student.bakil.student.tasks;
/*
 *      int a = 10;
		int b = 3;
		boolean x = a++==10 && ++b==4;
		boolean y = --a==10 || b--<4;
		sop(a);
		sop(b);
		sop(x);
		sop(y);
 */
public class Question_6_5 {

	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		boolean x = a++==10 && ++b==4;//true a=11 , b=4
		boolean y = --a==10 || b--<4;//true a=10 , b=4
        System.out.println(a);//11, 10
        System.out.println(b);//4 , 3
        System.out.println(x);
        System.out.println(y);




	}

}
