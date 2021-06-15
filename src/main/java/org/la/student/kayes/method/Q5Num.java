package org.la.student.kayes.method;

public class Q5Num {
	static void printNum(int k[],int x)
	{
		int c=0;
		for(int i=0;i<k.length;i++)
		{
			if(k[i]==x)
				c++;
		}
		if(c>0)
			System.out.println("THE NUMBER IS PRESENT IN THE ARRAY	"+x);
		else
			System.out.println("THE NUMBER	" +x+ "	IS NOT PRESENT IN THE ARRAY");
			
		
			
	}

	public static void main(String[] args) {
		int arr[]= {10,5,4,3,2,54,56,43,33,22,11,66,77,88};
		int n=56;
		printNum(arr,n);

	}


}
