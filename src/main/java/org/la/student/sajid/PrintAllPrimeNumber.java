package org.la.student.sajid;

public class PrintAllPrimeNumber {
	public static void main(String[] args) {
//		Wap to print all Prime numbers between 1 to n.
		int num=1000;
		for(int a=2;a<=num-1;a++) {
			if(num%a==0) {
				System.out.println(a);
			}
		}
	}

}

