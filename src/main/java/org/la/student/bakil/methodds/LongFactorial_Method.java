package org.la.student.bakil.methodds;
/*
 * long factorial(int)
		find factorial of given argument and return result
 */
public class LongFactorial_Method {


	public static void main(String[] args) {
	
		long result=factorial(6);
		System.out.println(result);
		
	}

	
	static long factorial(int n)
	{
		int i,fact=1;
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		
		return fact;

	}

	}
	
	
	

