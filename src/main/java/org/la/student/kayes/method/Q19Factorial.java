package org.la.student.kayes.method;

public class Q19Factorial {
	
	static long fact(int n)
	{
		int i,p=1;
		for(i=1;i<=n;i++)
		{
			p=p*i;
		}
		return p;

	}

	public static void main(String[] args) {
		long k=fact(5);
		System.out.println("Factorial="+k);
	}

}
