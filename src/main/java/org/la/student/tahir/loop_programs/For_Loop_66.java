package org.la.student.tahir.loop_programs;

public class For_Loop_66 {

	public static void main(String[] args) {
		//Wap to print all Strong numbers between 1 to n.
		
		int c =50000;
		for(int j=1; j<=c;j++) {
		int n=j;
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
		
	}}
}

