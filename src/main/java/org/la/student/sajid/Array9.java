package org.la.student.sajid;

public class Array9 {
	public static void main(String[] args) {
//		09) wap to print number not divisible by given number from an array
		int n=3;
		int []a= {1,2,3,5,49,61,52,99,884,48,5,199};
		for(int b=1;b<a.length;b++) {
			if(a[b]%n!=0) {
				System.out.print(a[b]);
			}
		}
	}

}
