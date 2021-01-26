package org.la.student.aameen.method;
	import java.util.Scanner;
public class CircumferenceandAreaofCircle {

	public static void main(String[] args) {
		// Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
		
		Scanner sc = new Scanner (System.in);
		int radius ;
		System.out.println("Enter the value of radius ");
		radius = sc.nextInt();
		
		circle(radius);
		
	}
	static void circle(int radius )
	{
		double pie = 3.14;
		
		double area = pie*radius*radius;
		System.out.println("Area of the cricle : " +area); 
		double circumference = 2*pie*radius;
		System.out.println("Circumference of circle : " +circumference);
		return;
	}
	

}
