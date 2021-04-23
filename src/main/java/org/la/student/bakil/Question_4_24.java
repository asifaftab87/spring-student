package org.la.student.bakil;

/*
 * int a = 4;
        a -= 10;
        a = -a;
        a = 7 + a;
        System.out.println(" a = " + a );
        a %= a;
        a = a * a - 3 ;
        System.out.println(" a = " + a );
 */
public class Question_4_24 {

	public static void main(String[] args) {
		int a = 4;
        a -= 10; //a=-6
        a = -a; // a= 6
       // a = 7 + a;// a=-5
        System.out.println(" a = " + a );
        a %= a; //-5%-5 =0
        a = a * a - 3 ; //a=-3
        System.out.println(" a = " + a );
	}

}
