package org.la.student.muhammad.abdullahi.array;

import java.util.Arrays;

class array28RemoveSpcElemnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

 int [] a = {1, 2, 3, 5, 9};
		 
		 int del=3;
		 
		 for (int i=0;i<a.length;i++)
		 {
			 if (del==a[i])
			 {
				 for (int j=i;j<a.length-1;j++)
				 {
					 a[j]=a[j+1];
				 }
				 
				 break;
			 }
		 }
		 
		 for (int i=0;i<a.length-1;i++)
		 {
			 System.out.print(a[i]+"  ");
		 }
		
		
		}
	}
