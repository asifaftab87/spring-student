package org.la.student.asif.loop;

public class SumNumber {

	//find sum of numbers
	
	public static void main(String[] args) {
		
		int i=28912; 
		
		int s = 0;
		
		for( ; i>0 ; ) {
			int r = i % 10;
			i = i / 10; 
			s = s + r;
		}
		
		System.out.println("sum number: "+s);
	}
}
