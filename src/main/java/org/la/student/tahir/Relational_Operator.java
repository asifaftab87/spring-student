package org.la.student.tahir;

public class Relational_Operator {

	public static void main(String[] args) {
	{int a=2, b=3;
	boolean c = a<b;
	boolean d = a>b;
	boolean e = a<=b;
	boolean f = a>=b;
	boolean g = a!=b;
	System.out.println("c : "+ c);
	System.out.println("d : "+ d);
	System.out.println("e : "+ e);
	System.out.println("f : "+ f);
	System.out.println("g : "+ g);}
	
	{int i= 10;
	int j= 15;
	i++;
	j--;
	int h = j%i;
	System.out.println(h>=j);}
	
	
	
	{
		int k = 1;
		int L= 2;
		if(k==1 || ++L==3) {
			System.out.println("hello world");}
	}
												
	
	{
		int k = 1;
		int L= 2;
		if(k==1 && ++L==3) {
			System.out.println("hello world");}
	}
	
	
	{
		int k = 1;
		int L= 2;
		if(k!=1 || L++==3) {
			System.out.println("hello world1");}
	}
	
	
	{
		boolean a = true;
		boolean b = true;
		boolean c = true;
		boolean d = false;
		boolean e = a || !b || c || !d;
		System.out.println("a : " +a);
		System.out.println("b : " +b);
		System.out.println("c : " +c);
		System.out.println("d : " +d);
		System.out.println("e : " +e);
	}
	
	
	
	
	}

}
