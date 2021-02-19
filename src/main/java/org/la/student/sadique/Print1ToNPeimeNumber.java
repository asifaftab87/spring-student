package org.la.student.sadique;

public class Print1ToNPeimeNumber {

		public static void main(String[] args) {
			// wap to print 1toN Prime number.
			int num=28;
		
			
			for(int i=1;i<=num;i++) {
				int sum=0;
				for(int j=2;j<=i-1;j++) {
					
					if(i%j==0)
						
						sum=sum+i;
						
				}	if(sum==0) {
					System.out.println(i + " is prime number ");
			  
				}
			}

	}

}
