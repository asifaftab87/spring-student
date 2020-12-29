package org.la.student.sajid;

public class Array20 {
	public static void main(String[] args) {
//		20) wap to check whether two array are equal or not(means we have to check each element of two arrays)?
		
		int a[]= {1,2,3};
		int b[]= {1,2,4};
		int i,j;
		for(i=0;i<a.length;i++) {
			for( j=i;j<b.length;j++) {
				if(a[i]==b[j]) {
					System.out.println("Each Element are equal: "+a[i]);
				}
			}
		}
	}

}
