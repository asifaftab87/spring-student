package org.la.student.sajid;

public class Array22 {
	public static void main(String[] args) {
//		22) wap to calculate the factorial of each element of an array?
		int a[]= {1,2,3,4,5};
		int j,i;
		for(i=0;i<a.length;i++) {
			int f=1;
			for(j=1;j<=a[i];j++) {
				f*=j;
				
			}System.out.println("Factorial of "+a[i]+" is "+f);
			
			
		}
	}

}
