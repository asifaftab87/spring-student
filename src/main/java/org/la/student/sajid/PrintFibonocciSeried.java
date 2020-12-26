package org.la.student.sajid;

public class PrintFibonocciSeried {
	public static void main(String[] args) {
//		wap to print fibonocci series
//		using forloop
		int a=1,b=1,s=a+b,n=7;
		System.out.println("using for loop");
		System.out.print(" "+a);
		System.out.print(" "+b);
		for(int i=1;i<=n;i++) {
			System.out.print(" "+s);
			a=b;
			b=s;;
			s=a+b;
		}System.out.println();
//		using while
		System.out.println("using while loop");
		int d=1,e=1,f=d+e,j=1;
		System.out.print(" "+d);
		System.out.print(" "+e);
		while(j<=n) {
			System.out.print(" "+f);
			d=e;
			e=f;
			f=d+e;
			j++;
		}
		
	}

}
