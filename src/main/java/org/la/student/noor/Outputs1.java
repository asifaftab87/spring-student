package org.la.student.noor;

public class Outputs1 {

	public static void main(String[] args) {
		
		int a=34;
		double d=20.5;
		d+=a;
		a+=d;
		d-=a;
		a-=d;
		System.out.println("d = "+ ++d);
		System.out.println("a = "+ a--);
		
		
		int c=4;
		c++;
		c+=c;
		--c;
		c=7+c;
		c*=c;
		c-=3;
		System.out.println("a = "+ a);
		
		
		int x=4;
		x-=10;
		x=-x;
		x=7+x;
		System.out.println("x = "+ x);
		x%=3;
		x=x*x-3;
		System.out.println("x = "+ x);
		
		
		int n=-4;
		n=n+1;
		n++;
		n+=1;
		++n;
		System.out.println("n = "+ n);
		
		
		short s=10;
		int e=s;
		s+=10;
		System.out.println(s + ","+ e);
		
		short p=10;
		int f=s;
		p+=10;
		System.out.println(p + ","+ f);
		
		int y=0152;
		int z=--y/2*2;
		System.out.println("y=" +y);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}