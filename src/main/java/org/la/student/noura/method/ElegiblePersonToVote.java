package org.la.student.noura.method;

import java.util.Scanner;

public class ElegiblePersonToVote {

	public static void main(String[] args) {
		//Define  a method to find out if he/she is eligible to vote
		
		int age;
		System.out.println("enter your age:");
		Scanner s= new Scanner(System.in);
		age=s.nextInt();
		vote(age);
		
	}

	static void vote(int a) {
				if (a>=16) {System.out.println("your voice was taken");}

		else System.out.println("you are not allowed to vote");
	}
}
