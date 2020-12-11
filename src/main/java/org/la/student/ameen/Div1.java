package org.la.student.ameen;

public class Div1 {

	public static void main(String[] args) {
		// wap to print all numbers between 10 to 50 those are divisible by 2 and 5.(using for loop)
		int num =10;
		for(int i = num ; i<=50; i++)
		{
			if(i%2==0||i%5==0)
			{
				System.out.println("i : " +i);
			}
		}

	}

}
