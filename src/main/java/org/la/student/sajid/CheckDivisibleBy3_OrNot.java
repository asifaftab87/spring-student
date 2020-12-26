package org.la.student.sajid;

public class CheckDivisibleBy3_OrNot {
	public static void main(String[] args) {
//		wap to check whether number is between -100 to 50
		int n=9;
		if(n%3==0) {
			System.out.println(n+" is Divisible by 3 ");
		}else {
			System.out.println(n+" is not Divisible by 3 ");
		}
		while(n%3==0) {
			System.out.println(n+" is Divisible by 3 ");
			if(n%3!=0) {
				System.out.println(n+" is not Divisible by 3 ");
			}
			break;}
		for(;n%3==0;) {
			System.out.println(n+" is Divisible by 3 ");
		if(n%3!=0) {
			System.out.println(n+" is not Divisible by 3 ");
		}
		break;}
	}
}
