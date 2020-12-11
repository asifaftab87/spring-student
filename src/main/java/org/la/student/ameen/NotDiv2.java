package org.la.student.ameen;

public class NotDiv2 {

	public static void main(String[] args) {
		// wap to print all numbers between 10 to 70 those are not divisible by 3 and 5.(using for loop)
		int num = 10;
		for(int i = num ; i<=70; i++)
		{
			if(i%3!=0||i%5!=0)
			{
				System.out.println(" i : " +i);
			}
		}

	}

}
