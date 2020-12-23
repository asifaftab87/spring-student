package org.la.student.tahir.loop_programs;

public class For_Loop_65 {

	public static void main(String[] args) {
		//Wap to check whether a number is Strong number or not.
		
		int n=145;
		int temp=n;
		int sum=0;
	
		
		for(; n!=0;) {
			int fact=1;
			int a = n%10;
			for(int i=1; i<=a;i++) {
				
				fact= fact*i;
				
			}
			
			sum= sum+ fact;
			
			n = n/10;
			
			}
		if( sum== temp)
		{System.out.println(temp+" is Strong");}
		
		else
			System.out.println(temp+" is Not strong");
		
		
		/*int n = 145, i;
		int total = 0;
		int temp_n = n;
		while(n != 0)
		{
		i = 1;
		int fact_n = 1;
		int lastdig = n % 10;
		while(i <= lastdig)
		{
		fact_n = fact_n * i;
		i++;
		}
		total = total + fact_n;
		n = n / 10;
		}
		if(total == temp_n)
		System.out.println(temp_n + " is a strong number\n");
		else
		System.out.println(temp_n + " is not a strong number\n");
		System.out.println();*/
	}
}

