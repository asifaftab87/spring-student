package org.la.student.abu;

public class for_loop02 {

	public static void main(String[] args) {
		//  To print all numbers between 100 to 1 those are divisible by 11 and 3.(using for loop)
		int num=100;
		for(int i = num ; i>=1;i--)
		{
			if(i%3==0||i%11==0)
			{
				System.out.println("i : " +i);
			}
		}

	}

}
