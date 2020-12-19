package org.la.student.ameen;

public class Palindrome {

	public static void main(String[] args) {
		// Wap to check whether a number is palindrome or not.
		int num =123,reversed = 0,remainder;
		int originalnum = num;
		while(num!=0)
		{
			remainder = num%10;
			reversed = reversed*10+remainder;
					num=num/10;
			
		}
		System.out.println(" reversed : "+reversed);
		if(originalnum==reversed)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}

	}

}
