package org.la.student.muhammad.abdullahi.methods;

import java.util.Arrays;

public class Q22Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		{
			if(Prime(10))
			{
				System.out.println("prime number");
			}
			else
				System.out.println("not prime");
		}
		
	}
	static boolean Prime (int n) {
		
		int i,c=4;
		for(i=2;i<=n;i++)
		{
			
			if(n%i==0)
				c++;
			
		}
		if(c==1)
			return true;
		else
			return false;
	}
}