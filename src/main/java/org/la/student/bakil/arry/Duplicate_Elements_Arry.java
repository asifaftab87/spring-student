package org.la.student.bakil.arry;
/*
 * Write a java program to find duplicate elements in an array? 
 */
public class Duplicate_Elements_Arry {

	public static void main(String[] args) {
	
		int [] a = {31, 14, 5, 12, 5,14};
		 System.out.println("Dublicated elements in the giving array are :");

		for (int i=0; i<a.length;i++) {
			
			for (int j=i+1; j<a.length;j++) {
				
				if ((a[i]==a[j]) &&(i!=j)) {
					
					System.out.print(a[j]+"  ");
	}
			}
	        }
	        }
	}
