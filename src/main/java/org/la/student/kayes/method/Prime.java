package org.la.student.kayes.method;

public class Prime {
	static boolean prime(int n)
	{
		int i,c=0;
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
	public static void main(String args[])
	{
		if(prime(10))
		{
			System.out.println("prime number");
		}
		else
			System.out.println("not prime");
	}

}
