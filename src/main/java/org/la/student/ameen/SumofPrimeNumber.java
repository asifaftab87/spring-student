package org.la.student.ameen;

public class SumofPrimeNumber {

	public static void main(String[] args) {
		// Wap to find sum of all prime numbers between 1 to n.
		int n =10;
        int sum = 0;

        for(int num = 1; num <= n; num++) {

            int i;

            for(i = 2; i <= (num / 2); i++) {

                if(num % i == 0) {
                   
                	i = num;
                    break;
                }
            }

            
            if(i != num) {
            	System.out.print(num + ",");
                sum += num;            
            }
        }

        System.out.println("   Sum of all prime numbers upto " + n + " : " + sum);
    }

}
