package org.la.student.bakil.arry;
/*
 * wap to print array in reverse order
 */
public class ReverseArray {

	public static void main(String[] args) {
	
		  int[] x = {10,20,30,40,50,60,70,80,90};
		     
		  //print array starting from first element
		    System.out.println("Original Array:");
		    for(int i=0;i<x.length;i++)
		         System.out.print(x[i] + "  ");
		     
		    System.out.println();
		     
		    //print array starting from last element
		    System.out.println("Original Array printed in reverse order:");
		         for(int i=x.length-1;i>=0;i--)
		         System.out.print(x[i] + "  ");
		         
		    }
		}
		

