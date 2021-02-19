package org.la.student.sadique;

public class SumOfAllOddnumber {

	public static void main(String[] args) {
		// Wap to find sum of all odd numbers between 1 to n.
		int n=12,m=0;
		for(int a=1;a<=n;a++) {
			if(a%2!=0)
		    m=m+a;
		}
		System.out.println(m);

  }
}
