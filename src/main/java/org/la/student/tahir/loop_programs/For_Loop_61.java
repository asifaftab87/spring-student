package org.la.student.tahir.loop_programs;

public class For_Loop_61 {

	public static void main(String[] args) {
		//Wap to check whether a number is Armstrong number or not.
		
		int n =371;
		int a, c=0;
		int b=n;
		
		for(; n>0; ) {
			
			a = n%10;
			n= n/10;
			
			c= c+(a*a*a);
			
		}
		
		if(b==c)
		System.out.println("Amstrong");
		
		else
			System.out.println("Not amstrong");
	}
}
