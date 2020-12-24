package org.la.student.sajid;

public class Array8 {
	public static void main(String[] args) {
//		08) wap to print number divisible by given number from an array
		
		int []a= {1,2,3,5,49,61,52,99,884,48,5,199};
		int n=3;
		for(int b=1;b<a.length;b++) {
			if(a[b]%n==0) {
				System.out.println(a[b]);
			}
		}
	}

}
