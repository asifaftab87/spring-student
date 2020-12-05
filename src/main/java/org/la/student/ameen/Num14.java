package org.la.student.ameen;

public class Num14 {

	public static void main(String[] args) {
		//wap to print all numbers from 1 to 10 except 2 and 5 and 8
		int num = 1;
		while(num<=10)
		{
			if(!(num == 2 || num == 5 || num == 8))
			{
				System.out.println("num : " +num);
			}
			num++;
		}

	}

}
