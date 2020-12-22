package org.la.student.sajid;

public class FindFactorialNumberOfgivenNumber {
	public static void main(String[] args) {
//		wap to find factorial of a given number
//		using for loop
		
		int n=4,f=1;
		System.out.println("using for loop");
		for(int a=1;a<=n;a++) {
			f*=a;
			
		}
		System.out.print("factorial number: "+f);
		f=1;
		System.out.println();
		System.out.println("using while loop");
		int a=1;
		while(a<=n) {
			f*=a;
			a++;
		}System.out.print("factorial number: "+f);
		
	}

}
