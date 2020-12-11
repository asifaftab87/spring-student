package org.la.student.ameen;

public class PrintAllNumber {

	public static void main(String[] args) {
		// wap to print all numbers from 1 to 10 except 3 and 7.(using for loop)
		
		int num = 1;
        for(int i=num;i<=10;i++)
        {
                    if(i==3||i==7) continue;
                    System.out.print(i +" ");
        }


	}

}
