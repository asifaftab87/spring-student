package org.la.student.tahir.method;

public class Checksomepropertiesofagivennumber {

	public static void main(String[] args) {
		
		int x =25;
		
		arg(x);
		cha(x);
		prime(x);
		fact(x);
		Divisibility(x);
		Multipleof10(x);
	}
	
	
	static void arg (int a) {
		
		if(a<0)
		System.out.println(a+" NEGATIVE " );
		else
			System.out.println(a+ " is POSITIVE");
	}
	
	static void cha( int a)  {
		
		if(a%2==0)
		System.out.println("The int value is even : " +a);
		
		else
			System.out.println("The int value is odd : " + a);
		
	}

	static void prime( int a)  {
		int n=2;
		for(;n<a;n++){
			
			if(a%n==0) {
				break;
			}
		}
		
		if(n==a)
			System.out.println("is prime");
		else
			System.out.println("is not prime");
		
	}
	
static void fact( int a)  {
		
	int	fact=1;
	for(int i=1;i<=a; i++) {
		
		fact = fact *i;
	}
		System.out.println("Factorial of " +a + " is: " + fact);
	}
	
static void Divisibility( int a)  {
	int b =5;
	if (a%b==0) {
		System.out.println(a+" is divisble by " + b);
	}
	else
		System.out.println(a+" is not divisible by " + b);
}

static void Multipleof10( int a)  {
	
	if (a%10==0) {
		System.out.println(a+" is a multiple of 10 " );
	}
	else
		System.out.println(a+" is not a multiple of 10 ");
}}


