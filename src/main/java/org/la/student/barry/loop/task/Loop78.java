package org.la.student.barry.loop.task;

import java.util.Scanner;

public class Loop78 {
	
	//Wap to print all Strong numbers between 1 to n.
	public static void main(String arg[])
	{
		int n,i;
		int fact_n,lastdig;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : " );
		n = sc.nextInt();
		int total = 0;
		int temp_n = n;
		while(n != 0)
		{
		i = 1;
		fact_n = 1;
		lastdig = n % 10;
		while(i <= lastdig)
		{
		fact_n = fact_n * i;
		i++;
		}
		total = total + fact_n;
		n = n / 10;
		}
		if(total == temp_n)
		System.out.println(temp_n + " is a strong number\n");
		else
		System.out.println(temp_n + " is not a strong number\n");
		System.out.println();
	 }
}
	
  

	
	
