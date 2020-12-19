package org.la.student.ameen;

public class SumNum {

	public static void main(String[] args) {
		// Sum of the number
		int i=123;
		int s = 0;
		for( ;i>0;)
		{
			int r = i%10;
			 i = i/10;
			s=s+r;
		}
		System.out.println("sum number : " +s);

	}

}
