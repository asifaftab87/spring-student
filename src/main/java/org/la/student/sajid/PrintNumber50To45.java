package org.la.student.sajid;

public class PrintNumber50To45 {
	public static void main(String[] args) {
//		wap to print number from 50 to 45
//		using for loop
		int num=50,n=num;
		System.out.println("Using For Loop");
		for( ;num>=45;num--) {
			System.out.print(" "+num);
		}System.out.println();
//			using while
			System.out.println("Using While loop");
			while(n>=45) {
				System.out.print(" "+n);
				n--;
			}
		
	}

}
