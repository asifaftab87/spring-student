package org.la.student.sadique;

public class CheekNumberBetween50ToMinus100 {

	public static void main(String[] args) {
		// 		wap to check whether number is between -100 to 50.
		//using if and else.
		int num=376;
		if(num>-100 && num<50) {
			System.out.println(num + " is between 50 to -100 ");
		} else {
			System.out.println( num + " is  not between 50 to -100  ");
		}
       // using without if and else.
		int a=18;
		for(; a>-100 && a<50 ;) {
			System.out.println( a + " is between 50 to -100  ");
			break;
		}
		for(; a<-100 || a>50 ;) {
			System.out.println(a + " is not between 50 to -100  ");
			break;
		}

	}

}
