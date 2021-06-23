package org.la.student.rasheed;

public class NumberOperation2 {

	public static void main(String[] args) {
		//prime number program
		// method is what? it change the flow of control,
		//When you call any method it jump to that method
	
				int a =107;
				
				
				factorial(6);
			}
			
			static void factorial(int n) {
				int p= 1;
				for (int i=1; i<n; i++) {
					p=p*i;
				}
				System.out.println("Factorial of n is = "+p);
				prime(44);

			}
			static void prime(int a) {
				
				int b =2;
				while (b < a) {
					if (a % b == 0) {
						break;
					}
					b++;
				}
				if (a == b) {
					System.out.println("is prime Number");
				}
				else {
					System.out.println("is Not Prime Number");
				}

	}

}
