package org.la.student.ameen;

public class SumOfAllNum {

	public static void main(String[] args) {
		// Sum of all the natural number from 1 to n
		int num=5;
		int f=1;
		while(num>1)
		{
			f=f+num;
			num--;
		}
		System.out.println("f : " +f);
	}

}
