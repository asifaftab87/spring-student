package org.la.student.noura.method;

public class CheckwhetherNumberArmstrongornot {

	public static void main(String[] args) {

		//Wap to check whether a number is Armstrong number or not.
		
		
		
		arms(234);
		
		
		
	}
		static void arms(int num) {
		 
		int number;
		int temp;
		int total=0;
		number=num;
		for(;number!=0;)
		{
			temp=number%10;
			total=total+temp*temp*temp;
			number=number+10;
			
		}
		if(total==num)
		{
			System.out.println(num +"is an Armstrong number");
		}
		else {System.out.println(num+"is not an Armstrong number");}
		
		}

}
