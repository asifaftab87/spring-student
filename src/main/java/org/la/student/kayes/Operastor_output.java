package org.la.student.kayes;

public class Operastor_output 
{

	public static void main(String[] args)
	{
		int x=5+3*4/5+4;
		System.out.println(x);
		
		
		double f= 14/5;
		System.out.println(f);
		
		
		int x1=15;
		int y1=x1%4;
		int z1=y1*24;
		System.out.println(z1/2);
		
		
		int i=34;
		int j=7;
		int k=i%j;
		System.out.println("k="+k);
		
		int x2=42;
		double y2=42.25;
		System.out.println("x2 mod 10="+x2%10);
		System.out.println("y2 mod 10="+y2%10);
		
		int a=31,b=40;
		int c=b-a;
		b=c%a;
		b=b/a;
		a=++c;
		b=(a- --b)*c;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		int num=69;
		int days= num%30;
		int months=num/30;
		System.out.println(months+"months and"+days+"days");
		
		int a1=56;
		int b1=-8;
		int c1=a1%b1;
		int d1=b1%a1;
		System.out.println(c1+","+d1);
		
		System.out.println(10*5+100*(25*11)/(25*10)*10-5+7%2);
		int zx=(10*5+100*(25*11));
		int yz=((25*10)*10-5+7%2);
		System.out.println(zx/yz);
		

	}

}
