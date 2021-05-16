package org.la.student.nizaam.array;

public class Q22Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,3,4,5};int fact=1;
		for(int i=0;i<a.length;i++) {
			fact=1;
			for(int j=0;j<a[i];j++) {
				
				fact=fact*(a[i]-j);
			}
			System.out.println("factorial of "+a[i]+ " is "+fact);
		}
	}

}
