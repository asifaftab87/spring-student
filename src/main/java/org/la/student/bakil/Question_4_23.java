package org.la.student.bakil;

/*
 * int a = 4;
        a++;
        a += a;
        --a;
        a = 7 + a;
        a *= a;
        a -= 3;
		System.out.println(" a = " + a );
 */
public class Question_4_23 {

	public static void main(String[] args) {
		int a = 4;
        a++; //a=5
        a += a; // 5+5=10
        --a; //a=9
        a = 7 + a;// 7+9=16
        a *= a; // 16*16=256
        a -= 3; //a=253
		System.out.println(" a = " + a );
	}

}
