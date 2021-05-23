package org.la.student.nizaam.loop.whilee;

public class Q58SwapFirst_Last {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	58.	Wap to swap first and last digits of a number.
		int num = 967892,first,last,temp,count=0,sub=1,mul=1;
		temp=num;
		
		//find first and last digit
		last=num%10;
		while(num>10) {
			num=num/10;
		}
		first=num;
		sub=sub*first;
	
		//find number of digits after removing last digit
		num=temp/10;
		while(num>10) {
			num=num/10;
			count++;
		}
		
		while(count>0) {
			sub=sub*10;
			mul=mul*10;
			count--;
					
		}
		
		temp = (temp/10)-sub;
		
		System.out.println(((last*mul)+temp)*10+first);
	}

}
