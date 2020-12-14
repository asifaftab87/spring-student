package org.la.student.noura.loop;

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		
		//	Wap to find sum of all natural numbers between 1 to n.

		// using for loop
		int s=0;
		for (int n=10 , i=1; i<=n;)
        {
        
        	s=s+i;
        	++i;
        }
		System.out.print(s);
	}

}
