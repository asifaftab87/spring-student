package org.la.student.noor;

public class Outputs {

	public static void main(String[] args) {
		int m=5+3*4/5+4;
		System.out.println(m);
		
		double n=14/5;
		System.out.println(n);
		
		
		int e=15;
		int f=e%4;
		int g=f*24;
		System.out.println(g/2);
		
		/*int i=34.0;
		int j=7;
		int k=i%j;
		System.out.println("k=" +k);*/
		
		
		int p=42;
		double q=42.25;
		System.out.println("p mod 10="+p%10);
		System.out.println("q mod 10="+q%10);
		
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
		int days=num%30;
		int month=num/30;
		System.out.println(month+"month and"+days +"days");
		
		int w=56;
		int x=-8;
		int y=w%x;
		int z=x%w;
		System.out.println(y+","+z);
		
		System.out.println(10*5+100*(25*11)/(25*10)*10-5+7%2);
		int zx=(10*5+100*(25*11));
		int yz=((25*10)*10-5+7%2);
		System.out.println(zx/yz);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
