package org.la.student.sadique;

public class SumOfAllPrimeNumber {


		public static void main(String[] args) {
			//Wap to find sum of all prime numbers between 1 to n. 
				SumOfAllPrimeNumber prime=new SumOfAllPrimeNumber();
				prime.sumOfPrime(); 

		    }
			public void sumOfPrime() {
				int n =5;
		        int sum = 0;

		        for(int num = 1; num <= n; num++) {
		        	int i;
		            for( i = 2; i <= (num / 2); i++) {
		                if(num % i == 0) {
		                	//System.out.println(num % i == 0);
		                	i = num;
		                    break;
		                   
		                }
		          }

		           if(i != num) {
		            	System.out.print(num + ",");
		               sum =sum+num;            
		            }
		        }
		        System.out.print(" Sum of all prime numbers upto " + n + " : " + sum);
			}
	}


