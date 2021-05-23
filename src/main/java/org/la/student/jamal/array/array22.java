package org.la.student.jamal.array;

public class array22 {
	
	//	22) wap to calculate the factorial of each element of an array?

	public static void main(String[] args) {
		
		
		int a[]= {3,4,5,6,7};
		int fact=1;
		
		for(int i=0;i<a.length;i++) {
			fact=1;
			for(int j=0;j<a[i];j++) {
				fact=fact*(a[i]-j);
			}
			System.out.println("factorial of "+a[i]+ " is "+fact);
		}
		
	
		
		
		
	}

}
