package org.la.student.noura.method;

public class CheckwhetherNumberArmstrongornot {

	public static void main(String[] args) {

		//Wap to check whether a number is Armstrong number or not.
		
		
		
		arms(234);
		
		
		
	}
		static void arms(int num) {
		 
		int number;
		int r;
		int total=0;
		number=num;
		for(;number!=0;)
		{
			r=number%10;//4
			total=total+r*r*r;//0+64=64
			number=number+10;//33
			
			
		}
		if(total==num)
		{
			System.out.println(num +"is an Armstrong number");
		}
		else {System.out.println(num+"is not an Armstrong number");}
		
		}

}
