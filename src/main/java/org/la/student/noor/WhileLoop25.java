package org.la.student.noor;
//wap to reverse a number e.g ip=12345, op=54321 avoid zero
public class WhileLoop25 {

	public static void main(String[] args) {
		int n=12345;
		int res=0;
		
		while(n>0) {
			int r=n%10;
		    n=n/10;
			res=res*10+r;
		}

		System.out.println("reverse num" +res);
	}

	}

