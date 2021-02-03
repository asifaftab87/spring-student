package org.la.student.sajid;

public class FindGivenNumberPrimeOrNot {
	public static void main(String[] args) {
		int n=6;
		System.out.println("Usnig for Loop");
		for(int a=1;a<=n;a++) {
			if(n%2==0) {
				System.out.print("Prime Number:");
				break;
			}else
			{
				System.out.print("Not Prime Number:");
			break;}
			
		}
		System.out.println();int i=1;
		System.out.println("Using While Loop");
		while(n==n) {
			if(n%2==0) {
				System.out.println("Prime Number:");
				break;
			}else{
				System.out.println("Not Prime Number:");
				break;
			}
		}
	}

}
