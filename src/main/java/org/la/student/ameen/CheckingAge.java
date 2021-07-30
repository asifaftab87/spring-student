package org.la.student.ameen;
import java.util.Scanner;

public class CheckingAge {

	public static void main(String[] args) {
		// wap to print kid if age<13, print teenage if age<18 and age>12, and adult if age>18
		
		int age ;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the age ");
		age=sc.nextInt();
		
		if(age<13)
		{
			System.out.println("Kid");
		}
		else if (age >12 && age<18)
		{
			System.out.println("Teenage");
		}
		else
		System.out.println("adult");
		
		
		

	}

}
