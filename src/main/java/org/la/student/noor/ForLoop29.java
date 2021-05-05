package org.la.student.noor;

public class ForLoop29 {

	public static void main(String[] args) {
		int number=5, i, expo=2;
		long power = 1;
		
		for(i = 1; i <= expo; i++)
		{
			power = power * number;
		}
		System.out.println("\n The Final result of " + number + " power " + expo + " = " + power);
	}

}
