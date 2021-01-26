package org.la.student.noura.method;

import java.util.Scanner;

public class CalculatingAreaofCircle {

	
	 public static void main(String[] args) 
	    {
	        int r;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter radius of circle:");
	        r = s.nextInt();
	        
	        double c=area(r);
	       System.out.println("area of circle = "+c);
	    }        
	 
	 static double area(int b) {
		 double pi = 3.14, area;
		 
		 area = pi * b * b;
		 return area;
	 }
	 
}
