package org.la.student.bakil.class6tasks_arry;
/*
 *Write a Java program to remove a specific element from an array?
 */
public class RemoveSpecificElementArray {

	public static void main(String[] args) {
	
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