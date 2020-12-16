package org.la.student.noura.loop;

public class CountNumOfDigit {

	public static void main(String[] args) {
		//	Wap to count number of digits in a number.
		//using for loop
		
		int num =125;
		int count =0;
		
		
		for(;num>0;count++) {
			
			num=num/10;
			
			
		}
System.out.println(count);
	}

}
