package org.la.student.ameen;

public class NotDivisiblefromArray {

	public static void main(String[] args) {
		// wap to print number not divisible by given number from an array
		int number = 2;
		int array [] = {1,2,3,4,5,6,7,8 };
		System.out.println(" Number not  Divisible by given number : " +number);
		for(int i = 0 ; i<array.length;i++)
		{
			if(array[i]%number!=0)
			{
				System.out.println(+array[i]);
			}
		}

	}

}
