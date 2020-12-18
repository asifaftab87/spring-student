package org.la.student.sajid;

public class FindSumOfAllEvenNumber {
	public static void main(String[] args) {
//		Wap to find sum of all even numbers between 1 to n.
		int n=10,s=0;
		for(int a=2;a<=n;a++) {
			if(a%2==0) {
				s=s+a;
				
			}
		}System.out.println(s);
	}

}
