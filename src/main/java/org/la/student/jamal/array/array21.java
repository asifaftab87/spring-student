package org.la.student.jamal.array;

public class array21 {
	
	//21) wap to print all prime numbers from an array ?

	public static void main(String[] args) {
		
		int a[]= {3,4,5,6,7,8,9};
		int b;
		boolean isPrime;
		
		for(int i=0;i<a.length;i++) {
			b=a[i]/2;
			isPrime=true;
			
			for(int j=2;j<=b;j++) {
				if(a[i]%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				System.out.println(a[i]);
			}
				
		}
		
		

	}

}
