package org.la.student.tahir.loop_programs;

public class For_Loop_62 {

	public static void main(String[] args) {
		//Wap to print all Armstrong numbers between 1 to n.
		
		int z=400;
		for(int i=1; i<=z; i++)
		
		{int n =i;
		int a, c=0;
		int b=n;
		
		for(; n>0; ) {
			
			a = n%10;
			n= n/10;
			
			c= c+(a*a*a);
			
			if(b==c)
				System.out.println(c+ " is Amstrong");
		}
		
	}
}}

