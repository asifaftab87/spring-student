package org.la.student.tahir.loop_programs;

public class For_Loop_45 {

	public static void main(String[] args) {
		
	// sum of all odd numbers between  1 to n
		
		
		
		int n =2;
		int sum=0;
		for(int i=1; i<=n; i++) {
			if(i%2!=0)
		 sum = sum + i;
		}
		
		System.out.println(sum);
		
		// sum  of odd numbers of a digit
		/*	int i=234;
			
			int s = 0;
			for(; i>0;) {
				
				int r = i%10;
			i = i/10;
			
			if(r%2!=0)
			s= s+r;
			
			}
			
			System.out.println(s);*/
		}
		
	}

