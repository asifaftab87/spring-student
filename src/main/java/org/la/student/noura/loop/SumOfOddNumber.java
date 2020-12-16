package org.la.student.noura.loop;

public class SumOfOddNumber {

	public static void main(String[] args) {
//		Wap to find sum of all odd numbers between 1 to n.

			//using while
			
			 int num = 10, sum = 0;
			 int i = 1;

		        while( i <= num)
		        {
		            if(i%2!=0)
		            sum += i;
		            ++i;
		        }

		        System.out.println("Sum = " + sum);
		    }

	

}
