package org.la.student.bakil.class5tasks.for_loop;
/*
 * Wap to check whether a number is Strong number or not.
 */
public class Question71 {

	public static void main(String[] args) {

		int n = 22,i;
		int fact,rem;
		int sum = 0;
		int temp = n;
		while(n != 0)
		{
		i = 1;
		fact = 1;
		rem = n % 10;

		while(i <= rem)
		{
		fact = fact * i;
		i++;
		}
		sum = sum + fact;
		n = n / 10;
		}

		if(sum == temp)
		System.out.println(temp + " is a strong number\n");
		else
		System.out.println(temp + " is not a strong number\n");

		System.out.println();
		}
		}
