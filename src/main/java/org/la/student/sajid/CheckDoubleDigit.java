package org.la.student.sajid;

public class CheckDoubleDigit {
	public static void main(String[] args) {
//		wap to print double if number is a double digit 
		
		int n=99;
		if(10<=n && n<=99) {
			System.out.println("this Number is Double:");
		}else {
			System.out.println("this Number is not double");
			  }
		while(10<=n && n<=99) {
			System.out.println("this number is Double");
			break;
		}
		for(;10<=n && n<=99;) {
			System.out.println("This Number is Double");
			break;
		}
	}

}
