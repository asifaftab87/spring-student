package org.la.student.sadique;

public class PrintyArmstrongNumber1ToN {

		public static void main(String[] args) {
			// Wap to print all Armstrong numbers between 1 to n.
			int s=0,a,m;
			int n=1;
			m=n;
			while(n>0) {
				a=n%10;
				n=n/10;
				s=s+(a*a*a);	
			}
			if (m==s) {
				System.out.println(s + " number is armstrong");
			}else {
				System.out.println(s + " number is not armstrong");
			}		
	  }
}
