package org.la.student.ameen;

public class NotDiv1 {

	public static void main(String[] args) {
		// wap to print all numbers between 30 to 80 those are divisible by 6 and 5.(using for loop)
		int num = 30;
		for(int i = num ; i<=80 ; i++)
		{
			if(i%5==0 || i%6==0)
			{
				System.out.println(" i : " +i);
			}
		}

	}

}
