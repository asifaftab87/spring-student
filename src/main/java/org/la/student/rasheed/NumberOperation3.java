package org.la.student.rasheed;

/*
 * How to check a number is Prime with boolean method
 */
public class NumberOperation3 {

	public static void main(String[] args) {
		//prime number program
				// method is what? it change the flow of control,
				//When you call any method it jump to that method
			
						int a =107;
						boolean b = prime(a);
						if (b) {
							
								System.out.println("is prime Number");
							}
							else {
								System.out.println("is Not Prime Number");
						}
						factorial(5);		
					
					}
					static boolean prime (int a) {
						
						int b =2;
						while (b < a) {
							if (a % b == 0) {
								break;
							}
							b++;
						}
						return a==b;
						}
					
					static void factorial(int n) {
						int p= 1;
						for (int i=1; i<n; i++) {
							p=p*i;
						}
						System.out.println("Factorial of n is = "+p);


	}

}
