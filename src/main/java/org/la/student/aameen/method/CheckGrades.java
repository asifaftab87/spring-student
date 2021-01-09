package org.la.student.aameen.method;
 import java.util.Scanner;
public class CheckGrades {

	public static void main(String[] args) {
		// Write a program which will ask the user to enter his/her marks (out of 100). Define a method that will display grades
		
		int marks;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks");
		marks=sc.nextInt();
		grade(marks);
	}
	
	static void grade(int mark)
	{
		if(mark>=91&&mark<=100)
		{
			System.out.println("AA");
		}
		else if(mark>=81&&mark<=90)
		{
			System.out.println("AB");
		}
		else if(mark>=71&&mark<=80)
		{
			System.out.println("BB");
		}
		else if(mark>=61&&mark<=70)
		{
			System.out.println("BC");
		}
		else if(mark>=51&&mark<=60)
		{
			System.out.println("CD");
		}
		else if(mark>=41&&mark<=50)
		{
			System.out.println("DD");
		}
		else 
		{
			System.out.println("Fail");
		}
		return;
	}
	

}
