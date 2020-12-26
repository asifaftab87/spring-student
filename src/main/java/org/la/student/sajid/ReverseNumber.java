package org.la.student.sajid;

public class ReverseNumber {
	public static void main(String[] args) {
//		wap to reverse a number e.g ip=12345, op=54321 avoid zero
//		using for loop
		int n=12345,m=n,r=0;
		System.out.println("Given Number:"+n);
		System.out.println("using for loop");
		for(;n!=0;) {
			int s=n%10;
			r=r*10+s;
			n/=10;
		}System.out.println(r);
		r=0;
//		using while loop
		
		System.out.println("using while loop");
		while(m!=0) {
			int e=m%10;
			r=r*10+e;
			m/=10;
		}System.out.println(r);
	}


}
