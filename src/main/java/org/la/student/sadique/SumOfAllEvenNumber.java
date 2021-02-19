package org.la.student.sadique;

public class SumOfAllEvenNumber {
	public static void main(String[] args) {
//		Wap to find sum of all even numbers between 1 to n.
		int n=12,m=0;
		for(int a=1;a<=n;a++) {
			if(a%2==0)
		    m=m+a;
		}
		    System.out.println("sum of all even numbers : "+ m);
		
	}

}
