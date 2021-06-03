package org.la.student.muhammad.abdullahi.array;

import java.util.Arrays;

class array41LoweToUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	char a[]= {'a','b','c'};
	char b []=  new char [a.length];	
		
		for(int i=0;i<a.length;i++) {
		b[i]=Character.toUpperCase(a[i]);	
			
		System.out.println(b[i]);
		}
		

		
	}
	}
