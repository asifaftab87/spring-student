package org.la.student.sajid;

public class WhileLoop8 {
	public static void main(String[] args) {
		
//		8. wap to print numbers which is completely divisible by 3 and 2 between 1 to 10.
		
		int a=1;
		
		while(a<=10) {
			if(a%3==0) {
				System.out.println("completely divisible by 3 ="+a);
				
			}
			if(a%2==0) {
				System.out.println("completely divisible by 2 ="+a);
			}
			a++;
		}
		
	}

}
