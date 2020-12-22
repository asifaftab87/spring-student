package org.la.student.sajid;

public class FindPowerOfForLoop {
	public static void main(String[] args) {
//		Wap to find power of a number using for loop.
		int n=3,r=4,s=1;
		for(;r!=0;) {
			s*=n;
			--r;
		}System.out.println("Answer: "+s);
	}

}
