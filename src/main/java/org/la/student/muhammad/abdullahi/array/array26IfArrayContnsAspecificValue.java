package org.la.student.muhammad.abdullahi.array;

import java.util.Arrays;

class array26IfArrayContnsAspecificValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,5,6},value=6;
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
