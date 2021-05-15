package org.la.student.nizaam.array;

public class Q26Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	26) Write a Java program to test if an array contains a specific value?
		
		int a[]= {1,2,3,4,5},value=6;
		boolean bool=false;
		for(int i=0;i<a.length;i++) {
			if(a[i]==value) {
				bool=true;
				break;
			}
		}
		if(bool)
			System.out.println("Array contains the value "+value);
		else
			System.out.println("Array doesn't contain the value "+value);
	}

}
