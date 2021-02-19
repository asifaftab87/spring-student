package org.la.student.sadique;

public class CheekLessThen100orNot {

	public static void main(String[] args) {
		// wap to check whether number is less than 100 or not
		//using if and else.
		
		int num=36;
		if(num<100) {
			System.out.println(num + " is less then 100 ");
		} else {
			System.out.println( num + " is not less then 100 ");
		}
       // using without if else.
		int a=173;
		for(;a<100;) {
			System.out.println( a + " is less then 100 ");
			break;
		}
		for(;a>100;) {
			System.out.println(a + " is not less then 100 ");
			break;
		}
	}

}
