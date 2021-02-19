package org.la.student.sadique;

public class CheekNumberIsNegativeOrNot {
	public static void main(String[] args) {
		//wap to find a given number is negative or not? ( using if and without if).
		//using (if and else)
		int a=-54;
		
		if(a<0) {
			System.out.println(a + " : is a negative number ");
		}else   {
			System.out.println(a + " : is not negative number ");
		}
	   // using without if else
		int b=-10;
		
		for(;b>=0;)
	   
	   {   System.out.println(b + " is  not negative number");		  
		    break; 
	   }
		for(;b<0;) {
		   System.out.println(b +" is negative number");
			break;
	   }
		 
	   }	
}