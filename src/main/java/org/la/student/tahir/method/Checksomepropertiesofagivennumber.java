package org.la.student.tahir.method;

public class Checksomepropertiesofagivennumber {

	public static void main(String[] args) {
		
		int x =2000;
		
		
		
		System.out.println("Number : "  +x );
		
		arg(x);
		cha(x);
		prime(x);
		fact(x);
		Divisibility(x);
		Multipleof10(x);
		A(x);
		B(x);
		C(x);
		D(x);
		E(x);
		F(x);
		G(x);
		H(x);
		I(x);
		J(x);
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
}

static void A( int a)  {
	//wap to print zero if number zero, 1 if positive and -1 if number is negative
	if (a==0) {
		System.out.println("0");
	}
	else if (a>0)
		System.out.println("1");
	else
		System.out.println("-1");
}


static void B( int a)  {
	//wap to check whether number is less than 100 or not
	if (a<100) {
		System.out.println("Yes number is less than 100");
	}
	else 
		System.out.println("No number is not less than 100");
}


static void C( int a)  {
	//wap to check whether number is between -100 to 50
	if (a>=-100 && a<=50) {
		System.out.println("Yes number is between -100 to 50");
	}
	else 
		System.out.println("No number is not between -100 to 50");
}

static void D( int a)  {
	//wap to print whether number is divisible by 3 or not
	if (a%3==0) {
		System.out.println("Yes number is divisible by 3");
	}
	else 
		System.out.println("No number is not divisible by 3");
}

static void E( int a)  {
	//wap to print whether number is divisible by 7 or not
	if (a%7==0) {
		System.out.println("Yes number is divisible by 7");
	}
	else 
		System.out.println("No number is not divisible by 7");
}

static void F( int a)  {
	//wap to print hi if number is zero and by if number is 100
	if (a==0) {
		System.out.println("Hi");
	}
	else if(a==100)
		System.out.println("By");
}

static void G( int a)  {
	//wap to print double if number is a double digit
	if ((a>=10 && a<100) || (a<=-10 && a>-100)){
		System.out.println("number is a double digit");
	}
	else 
		System.out.println("number is not a double digit");
}

static void H( int a)  {
	//wap to print single if number is a single digit
	if (a>-10 && a<10) {
		System.out.println("number is a single digit");
	}
	else 
		System.out.println("number is not a single digit");
}

static void I( int a)  {
	//wap to print ternary if number is 3 digit
	if (a>=100 && a<1000){
		System.out.println("Ternary");
	}
	else 
		System.out.println("Not Ternary");
}

static void J( int a)  {
	//wap to print 100 if number is between 100 to 200
	if (a>=100 && a<=200) {
		System.out.println("100");
	}




}}

