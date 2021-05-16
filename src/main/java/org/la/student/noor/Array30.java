package org.la.student.noor;
//Write a Java program to find the common elements between two arrays?
public class Array30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5},b[]= {1,4,6,7,9};

		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++)
				if(a[i]==b[j])
					System.out.print(a[i]+",");
		}
	}

}
