package org.la.student.tania;

public class Exmple_pre_post {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int y=-2;
		int z= ++x * y++;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
		int m=3;
		int n=-2;
		int p= m++ * n++;
		System.out.println(m);
		System.out.println(n);
		System.out.println(p);
		
		int a=-5;
		int b=2;
		int c= --a * b++;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		int e=0;
		int f=-2;
		int h= ++e * f++;
		System.out.println(e);
		System.out.println(f);
		System.out.println(h);
		


	}

}
