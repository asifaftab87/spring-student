package org.la.student.sadique;

public class SwipFirstAndLast {

	public static void main(String[] args) {
		// Wap to swap first and last digits of a number.
		int n=9876
				,l,c,r=0,swap,temp=n,d,f=0;
		l=n%10;
		while(n>10) {
			n=n/10;
			
			
		}
		f=n;
		n=temp/10;
		while(n>10) {
			c=n%10;
			r=r*10+c;
			n=n/10;
		}
		swap=l;
		
		while(r>0) {
			d=r%10;
			swap=swap*10+d;
			r=r/10;
		}
		swap=swap*10+f;
		System.out.println(swap);
			
		
		
		

	}

}
