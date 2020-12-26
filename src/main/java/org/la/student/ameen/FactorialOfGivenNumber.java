package org.la.student.ameen;

public class FactorialOfGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f = 1 ;
		int num = 7;
		while(num>1)
		{
			f=f*num;
			num--;
		}
		System.out.println(" factorial of given number : " +f);
	}

}
