package org.la.student.ameen;

public class CountDigitNum {

	public static void main(String[] args) {
		// count number of digit in a number
		int num = 1234;
		int count =0;
		while(num!=0) 
		{
			
			num=num/10;
			count++;
			
		}
		System.out.println("count : " +count);
	}

}
