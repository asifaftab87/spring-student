package org.la.student.noor;
//Write a Java program to test if an array contains a specific value?
public class Array26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7};
		int value=7;
		boolean result=false;
		for(int i=0;i<a.length;i++) {
			if(a[i]==value) {
				result=true;
				break;
			}
		}
		if(result)
			System.out.println("Array contains the value "+value);
		else
			System.out.println("Array doesn't contain the value "+value);
	}


}
