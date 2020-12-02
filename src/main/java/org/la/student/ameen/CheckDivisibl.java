package org.la.student.ameen;

public class CheckDivisibl {

	public static void main(String[] args) {
		// 	wap to print all numbers between 10 to 50 those are divisible by 5 and 9.
		int num=10;
		while(num<=50)
		{
			if(num % 5==0 || num % 9==0)
			{
				System.out.println("num : " +num);
			}
			num++;
		}

	}

}
