package org.la.student.nizaam.array;

public class Q35ArrayofInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	35) Write a Java program to check if an array of integers without 0 and -1?
		int a[]= {1,2,3,4,5,-1};
		boolean flag=false;
		for(int i=0;i<a.length;i++) {
			if(a[i]==0 ||a[i]==-1)
				flag=true;
		}
		if(flag)
			System.out.println("Array contains 0 or -1");
		else
			System.out.println("Array doesn't contain 0 or -1");
	}

}
