package org.la.student.bakil.class6tasks_arry;
/*
 * Write a Java program to separate even and odd numbers of a given
 *  array of integers. Put all even numbers first, and then odd numbers ?
 */
public class SeprateEvenAndOddNumbersArray {

	public static void main(String[] args) {
		int a[]={1,23,2,16,5,6,3,2};  
		
		
		System.out.println("Even Numbers:");  
		
		for(int i=0;i<a.length;i++)
		{  
		if(a[i]%2==0)
		{  
		System.out.println(a[i]);  
		}  
		}  
		
		System.out.println("Odd Numbers:");  
		
		for(int i=0;i<a.length;i++)
		{  
		if(a[i]%2!=0)
		{  
		System.out.println(a[i]);  
		}  
		}  
		
		}
}