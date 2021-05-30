package org.la.student.mdnawaz;

public class TernaryExample3 {

	public static void main(String[] args) {

		int x=69; 
		
		int y=89;
		
		int z=79; 
		
		int largestNumber= (x > y) ? (x > z ? x : z) : (y > z ? y : z); 
		
		System.out.println("The largest number is:  "+largestNumber);  
		}  

	}


