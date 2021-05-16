package org.la.student.nizaam.array;

public class Q30CommonEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	30) Write a Java program to find the common elements between two arrays?
		
		int a[]= {1,2,3,4,5},b[]= {1,3,5,6,7};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++)
				if(a[i]==b[j])
					System.out.print(a[i]+",");
		}
	}

}
