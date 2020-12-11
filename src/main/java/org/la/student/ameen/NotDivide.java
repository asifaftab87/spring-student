package org.la.student.ameen;

public class NotDivide {

	public static void main(String[] args) {
		// wap to print all numbers between 130 to 90 those are not divisible by 10.(using for loop)
		int num = 130;
		for(int i = num ; i>=90 ; i--)
		{
			if(i%10!=0)
			{
				System.out.println("i : " +i);
			}
		}

	}

}
