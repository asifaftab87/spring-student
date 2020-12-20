package org.la.student.noura.loop;

public class CalculateProductOfDigits {

	public static void main(String[] args) {
		//Wap to calculate product of digits of a number
	
		int num=2345;
		int p=1;
		 while(num>=1) {
			 int r=num%10;//5
			 num=num/10;
			 p=p*r;
		 }
	System.out.println(p);
	}

}
