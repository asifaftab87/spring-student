package org.la.student.sadique.loop;
//wap to print numbers which is completely divisible by 3 between 1 to 10.
public class CheekDivisiblity {
	public static void main(String[] args) {
		int a;
		for (a = 1; a <= 10; a++) {
			if (a % 3 == 0)
				System.out.println(a + " Is Divisible by 3 ");
		}
		System.out.println(" ");
		//  wap to print numbers which is completely divisible by 10 between 1 to 100.
		for (a = 1; a <= 100; a++) {
			if (a % 10 == 0)
				System.out.println(a + " Is Divisible by 10");
		}
		System.out.println(" ");
		//  wap to print numbers which is completely divisible by 3 and 2 between 1 to
		
		for (a = 1; a <= 10; a++) {
			if (a % 2 == 0 && a % 3 == 0)
				System.out.println("Only "+a +" Is Divisible by 2 and 3");
		}
		//wap to print numbers which is multiple of 3 between 1 to 22.
		for(a=1;a<=22;a++) {
			if(a%3==0)
				System.out.println("Multiple of 3 : "+a);
		}System.out.println(" ");
		//wap to print all numbers between 1 to 150 multiple of 11.
		for(a=1;a<=150;a++) {
			if(a%11==0)
				System.out.println("Multiple of 11 : "+a);
		}
	}

}
