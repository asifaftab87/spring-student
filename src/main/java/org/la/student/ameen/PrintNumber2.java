package org.la.student.ameen;

public class PrintNumber2 {

	public static void main(String[] args) {
		// wap to print all numbers from 1 to 10 except 2 and 5 and 8
		int num = 1;
		for(int i = num ; i<=10;i++)
		{
			if(i==2||i==5||i==8) continue;
			
			System.out.println("i : " +i);
		}

	}

}
