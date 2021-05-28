package org.la.student.barry.method;

public class NumberOperation {

	public static void main(String[] args) {
	// Prime number  program
		 int a= 107;
		 prime(a);
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
 static void prime(int a) {
		 
			int b=2;
			while(b<a) {
				if (a % b ==0) {
					break;
				}
				b++;
			}
			if(a==b) {
				System.out.println("Is Prime Number");
			} 
			else {
				System.out.println("is not Prime Number");
			} 
		 
	 }

}
