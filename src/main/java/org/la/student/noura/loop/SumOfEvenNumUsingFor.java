package org.la.student.noura.loop;

public class SumOfEvenNumUsingFor {

	public static void main(String[] args) {
		
		//	Wap to find sum of all even numbers between 1 to n.
		//using for

		 int num = 13, sum = 0;

	        for(int i = 1; i <= num; ++i)
	        {
	            if(i%2==0)
	            sum += i;
	        }

	        System.out.println("Sum = " + sum);
	  }

	
}
