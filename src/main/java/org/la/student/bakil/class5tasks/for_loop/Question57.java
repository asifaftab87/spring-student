package org.la.student.bakil.class5tasks.for_loop;

/*
 * Wap to swap first and last digits of a number.
 */
public class Question57 {

	public static void main(String[] args) {
	
		int n=99876,f,l,r=0,tmp,swap,c,d;
		tmp=n;
		l=n%10;
		while(n>10)
		{
		n=n/10;
		}
		f=n;
		n=tmp/10;
		while(n>10)
		{
		c=n%10;
		r=r*10+c;
		n=n/10;
		}
		swap=l;
		while(r>0)
		{
		d=r%10;
		swap=swap*10+d;
		r=r/10;
		}
		swap=swap*10+f;
		System.out.println("After swap:"+swap);
		}
}	
	

