package org.la.student.sajid;

public class CheckNumberBetweenNumber {
	public static void main(String[] args) {
//		wap to check whether number is between -100 to 50
		
		int n=-5;
		if(n<=50 && -100<=n) {
			System.out.println("This Number Between -100 to 50: "+n);
		}else {
			System.out.println("This Number Not Between -100 to 50: ");
		}
		while(-100<=50) {
			System.out.println("This Number Between -100 to 50: ");
			break;
		}
		for(;-100<=50;) {
			System.out.println("This Number Between -100 to 50: ");
			break;
		}
	}

}
