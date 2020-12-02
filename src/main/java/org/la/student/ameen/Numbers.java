package org.la.student.ameen;

public class Numbers {

	public static void main(String[] args) {
		//wap to print all numbers between 30 to 80 those are divisible by 6 and 5.
		int num = 30;
		while(num<=80)
		{
			if(num % 6==0 || num % 5 == 0 )
			{
				System.out.println("num : " +num);
			}
			num++;
		}

	}

}
