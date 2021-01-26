package org.la.student.noura.method;
import java.util.Scanner;

public class MaximumMininmumValue {

	public static void main(String[] args) {
		// java program to find out maximum and minimum value
		int num1,num2,num3;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num1 ,num2, num3");
		

		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		max(num1,num2,num3);
		min(num1,num2,num3);
	}

	static void max(int a, int b, int c) {
		
		if (a>b&&a>c) {System.out.println("maximum number = "+a);}
		else if(b>a&&b>c) {System.out.println("maxixmum number = "+b);}
		else{System.out.println("maximum number = "+c);}
		
	}
	
	static void min(int x,int y,int z) {
		if(x<y&&x<z){System.out.println("The Minimun number is : " +x);}
		
		else if(y<x&&y<z){System.out.println("The Minimum number is :" +y);}
		
		else{System.out.println("The Minimum number is : " +z);}
	}

	
}
