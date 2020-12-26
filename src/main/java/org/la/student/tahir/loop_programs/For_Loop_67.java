package org.la.student.tahir.loop_programs;

public class For_Loop_67 {

	public static void main(String[] args) {
		//Wap to print Fibonacci series up to n terms.
		
		int a =1, b=1, s=a+b;
		System.out.println(a);
		System.out.println(b);
		
		for(int i=1; i<=10; i++) {
			
			System.out.println(s);
			a=b;
			b=s;
			s=a+b;
		
		}
		
	}
}

