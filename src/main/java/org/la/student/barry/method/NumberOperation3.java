package org.la.student.barry.method;

public class NumberOperation3 {

	public static void main(String[] args) {
	// Prime number  program
		 int a= 107;
		boolean b= prime(a);
		if(b) {
			System.out.println("Is Prime Number");
		} 
		else {
			System.out.println("is not Prime Number");
		} 
		 factorial(5);
		            
		 // factorial 
	
		
	} 
	static void factorial (int n) {
	   int p=1;
	for(int i=1; i<=n; i++) {
			p=p*i;
		}
		System.out.println("Factorial=" +p);
		
	}
 static boolean prime(int a) {
		 
			int b=2;
			while(b<a) {
				if (a % b ==0) {
					break;
				}
				b++;
			}
			
		 return a==b;
	 }

}
