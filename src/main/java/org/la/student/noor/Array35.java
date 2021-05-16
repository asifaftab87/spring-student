package org.la.student.noor;
//Write a Java program to check if an array of integers without 0 and -1?
public class Array35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,4,7,0,3,-1};
		boolean result=false;
		for(int i=0;i<a.length;i++) {
			if(a[i]==0 ||a[i]==-1)
				result=true;
		}
		if(result)
			System.out.println("Array contains 0 or -1");
		else
			System.out.println("Array doesn't contain 0 or -1");
	}

}
