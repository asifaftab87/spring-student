package org.la.student.aameen.method;
 import java.util.Scanner;
public class EligibleorNot {

	public static void main(String[] args) {
		// A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

		int age ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Provide the age ");
		age=sc.nextInt();
		
		vote(age);
	}
	static void vote(int age )
	{
		
		if(age>=18)
		{
			System.out.println("He/She is eligible to vote ");
		}
		else {
			System.out.println("He/She is not eligible to vote ");
		}
		return;
		}

}
