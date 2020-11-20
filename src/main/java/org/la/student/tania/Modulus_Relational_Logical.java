package org.la.student.tania;

public class Modulus_Relational_Logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=34;
		double d=20.5;
		d+=a;
		a+=d;
		d-=a;
		a-=d;
		System.out.println("d = " + ++d);
		System.out.println(" a = " + a--);
		
		int b=4;
		b++;
		b +=b;
		--b;
		b=7+b;
		b*=b;
		b -=3;
		System.out.println("b = " + b);
		
		int c=4;
		c-=10;
		c=-c;
		c=7+c;
		System.out.println("c = " + c);
		c%=c;
		c=c*c-3;
		System.out.println("c = " + c);
		
		int e=-4;
		e=e+1;
		e++;
		e+=1;
		++e;
		System.out.println("a = " + a);
		
		short s=11;
		int k=s;
		System.out.println(s + "," + k);
		
		int u=0152;
		u *=--u/2*2;
		System.out.println("u =" +u);
		
		
		
		
		
		
		
		
		

	}

}
