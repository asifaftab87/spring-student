package org.la.student.aameen.method;
import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		//  Write java program to create a  method that accepts the side of a triangle and returns the area of the triangle
		Scanner sc = new Scanner(System.in);
		
		
		float base  ,height ;
		
		System.out.println(" Enter the value of base ");
		base = sc.nextFloat();
		System.out.println("Enter the value of height ");
			
		
		height=sc.nextFloat();
		
		
		System.out.println("Area of triangle "+side(base,height));
		
	}
	static float side (float b , float h)
	{
	
	float	area = (b*h)/2;
		return area;
	}
	
	
		
	}
	


