package org.la.student.bakil.objects;
/*
 * create a class of name Arithmetic, add methods like add, sub, div, prod, fibonacci, prime, factorial. 
    make these methods return type and arguments according to your wish.
 */
public class Arithmetic {

	
	
	public int sum (int a, int b) {
		return a+b;
	}
	
	public int sub (int i , int x) {
		return i-x;
	}
	
	public double  div (int c,int v) {
		return c/v;
	}
	
	public int prod(int x) {
		int product =1;
		for(int i=1;i<=x;i++) {
			product *= i;
			System.out.println("Product of "+x+" :"+product);

		}
		return product;

	}
	
	public void fibo(int n)
	{
		 int n1=0,n2=1,n3,i;    
		 System.out.print(n1+" "+n2);    
		    
		 for(i=2;i<n;++i)   
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }   
	}
	
	public void prime (int n) {
		int i,c=0;
		for(i=2;i<=n;i++)
		{
			
			if(n%i==0)
				c++;
			
		}
		if(c==1)
			System.out.println("THE NUMBER IS A PRIME NUMBER");
		else
			System.out.println("THE NUMBER IS NOT A PRIME NUMBER");

	}
	
	public void factorial (int n) {
		int i,p=1;
		for(i=1;i<=n;i++)
		{
			p=p*i;
		}
		System.out.println("Factorial="+p);
	}
}
