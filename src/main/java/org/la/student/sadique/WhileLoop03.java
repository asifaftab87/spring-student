package org.la.student.sadique;

public class WhileLoop03 {

	public static void main(String[] args) {
		// 3.	wap to print negative number among two given numbers( using if and else ).
		int x=-45;
		int y=24;
		if(x<0) {
			System.out.println(x+ " is negative");
		}else {
			System.out.println(y+ " is negative");
		}
//		without if else
		int z=(x<0)?x:(y<0?y:0);{
			System.out.println(z);
		}

	}

}
