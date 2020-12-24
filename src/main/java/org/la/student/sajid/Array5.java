package org.la.student.sajid;

public class Array5 {
	public static void main(String[] args) {
//		05) wap to print only even number from an array
		
		int []a= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		System.out.println("Even Number");
		for(int s=0;s<a.length;s++) {
			if(a[s]%2==0) {
				System.out.print(a[s]+",");
			}
		}
	}

}
