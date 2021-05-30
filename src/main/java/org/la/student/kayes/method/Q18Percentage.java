package org.la.student.kayes.method;

public class Q18Percentage {
	public static void main(String[] args) {
		int a=60;
		int b=80;
		int c=55;
		int d=65;
		int e=45;
		int s=a+b+c+d+e;
		double n=percent(a,s);
		System.out.println("percentage of  "+a+"  =  "+n);

	}
	static double percent(int n1,int  m)
	{
		double k=n1/m*100;
		return k;
	}


}
