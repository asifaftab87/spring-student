package org.la.student.asif.clas;

public class Arithmetic {

	public void fibonacci(int n) {
		
		int a=0, b=1,c;
		
		for(int i=1;i<=n;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
	
	public void printTable(int n) {
		
		for(int i=1 ; i<=10 ; i++) {
			System.out.println(n+" * "+i+" = "+n*i);
		}
	}
	
	public int sum(int a, int b) {
		return a+b;
	}
	
	public void prime(int a) {
		int b = 2;
		while (b < a) {
			if (a % b == 0) {
				break;
			}
			b++;
		}
		if (a == b) {
			System.out.println(a+": Is a Prime Number");
		} else {
			System.out.println(a+": Is Not a Prime Number");
		}
	}
}
