package org.la.student.sajid;

public class CheckNumberLess100OrNot {
	public static void main(String[] args) {
//		wap to check whether number is less than 100 or not
		
		int n=6;
		if(n<=100 && n>=0) {
			System.out.println("yes: This Number Is Less Then 100 ");
		}else if(n>=100) {
			System.out.println("No: This Number Is Not Less Then 100");
		}else
			System.out.println("Negative Number Not Valiad");
	}

}
