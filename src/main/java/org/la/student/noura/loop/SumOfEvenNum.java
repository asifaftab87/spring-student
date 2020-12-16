package org.la.student.noura.loop;

public class SumOfEvenNum {

	public static void main(String[] args) {
		//	Wap to find sum of all even numbers between 1 to n.


		//using while
		
		
		int num=13;
		int sum=0;
		int i=1;
		while(i<=num)
		{
			if(i%2==0)
			
				sum =sum+i;
				++i;

			
		}
		System.out.println("sum= "+sum);

	  }
	}

