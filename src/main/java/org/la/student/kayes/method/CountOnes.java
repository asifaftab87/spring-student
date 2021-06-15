package org.la.student.kayes.method;

public class CountOnes {
	static int count(int a[])
	{
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==1)
				c++;
		}
		return c;
	}

	public static void main(String[] args) {
		 int n[] = {1,2,1,3,2,1,1,1};
		 int n1=count(n);
		 System.out.println("number of 1 in arrays=  "+n1);
		 

	}

}
