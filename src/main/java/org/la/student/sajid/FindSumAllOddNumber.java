package org.la.student.sajid;

public class FindSumAllOddNumber {
	public static void main(String[] args) {
//		Wap to find sum of all odd numbers between 1 to n.
		int n=100;
		for(int a=1;a<=n;a++) {
			if(a%2!=0) {
				System.out.println(a);
			}
		}
	}

}
