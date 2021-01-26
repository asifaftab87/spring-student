package org.la.student.noura.array;

public class Copy2ArraysintoThirdArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3}, b[]= {4,5,6};
		int c[]= new int [a.length+b.length];
		int i=0;
		for (;i<a.length;i++) {
			c[i]=a[i];
		}
		for (int x=0;x<b.length;x++) {
			
			
			c[i]=b[x];
			i++;
		}

		for (int k=0;k<c.length;k++) {
			System.out.println(c[k]);
		}
	}

}
