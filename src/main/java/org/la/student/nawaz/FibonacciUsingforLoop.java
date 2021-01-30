package org.la.student.nawaz;

public class FibonacciUsingforLoop {
	
	public static void main(String[] args) {
		
		int MaxNumber=15 ; int PreviousNumber=0 ; int NextNumber=1;
		
		System.out.println("Fibonacci Series of the number "+MaxNumber+" are: ");
		System.out.println();
	
	     for (int i=1; i<=MaxNumber;++i)
	    	 {
	    	 System.out.print(PreviousNumber + " ");
	    	 
	          int Sum=PreviousNumber+NextNumber;
		      PreviousNumber=NextNumber;
		      NextNumber=Sum;
	   }

}
}