package org.la.student.rasheed.clas;

//wap to find given number is prime or not 

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
		
		
		for (int i=0; i<=10; i++) {
			System.out.println(n+" * "+i+" = "+n*i);
		}
	}
	
	
	public int sum(int a, int b) {
		return a+b;
	}

	public void prime (int a) {
				
				
				int b = 2;
				while (b < a) {
					if (a % b == 0) {
						break;
					}
					b++;
				}
				if (a == b) {
					System.out.println(a+": is a prime Number");
					
				}else {
					System.out.println(a+": is not a prime Number");
				}

	}

}
