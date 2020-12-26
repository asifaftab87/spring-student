package org.la.student.sajid;

public class FindSumOfNumber {
	public static void main(String[] args) {
//		wap to find sum of a number e.g ip=1234,  op=10
		int n=10,t=0;
//		using for loop
		System.out.println("using for loop");
		for(int a=1;a<=n;a++) {
			t=t+a;
		}System.out.println(t);
		t=0;
//	using while loop	
		System.out.println("using while loop");
		int a=1;
		while(a<=n) {
			t=t+a;
			a++;
		}System.out.println(t);
		
	}

}
