package org.la.student.kayes.method;

public class CountZero {

	static int count(int a[])
	{
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
				c++;
		}
		return c;
	}

	public static void main(String[] args) {
		 int n[] = {1,0,1,0,0,1,1,0};
		 int n1=count(n);
		 System.out.println("number of 0 in arrays=  "+n1);
		 

	}

	}


