package org.la.student.sajid;

public class CheckPrimeOrNot {
	public static void main(String[] args) {
//		Wap to check whether a number is Prime number or not.
		int n=7,tmp=0;
		for(int a=2;a<=n-1;a++) {
			if(n%a==0) {
				tmp=tmp+1;
			}
		}
		if(tmp==0) {
			System.out.println("is prime number:"+n);
		}else
			System.out.println("is not prime number:"+n);
	}

}
