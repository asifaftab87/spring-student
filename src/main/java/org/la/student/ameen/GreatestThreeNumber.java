package org.la.student.ameen;

public class GreatestThreeNumber {

	public static void main(String[] args) {
		// wap to find greatest number among three numbers
		int num1 = 34 , num2 = 76 , num3 = 56;
		if(num1 > num2 && num1 > num3)
		{
		 System.out.println("num1 is the greatest number among three");
		}
		else if(num2 > num1 && num2 > num3)
		{
			System.out.println("num2 is the greatest number among three");
		}
		else
		{
			System.out.println("num3 is  the greatest nhumber among three");
		}

	}

}
