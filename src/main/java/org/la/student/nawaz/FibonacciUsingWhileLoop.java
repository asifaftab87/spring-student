package org.la.student.nawaz;

public class FibonacciUsingWhileLoop {
	
   public static void main(String[] args) {
		
		int i=1; int MaxNumber=20 ; int PreviousNumber=0 ; int NextNumber=1;
		
		System.out.println("Fibonacci Series of the number "+MaxNumber+" are: ");
		System.out.println();
		
			while (i<=MaxNumber)
				
			{
	           System.out.print(PreviousNumber + " ");
	           
	    	   int Sum=PreviousNumber+NextNumber;
		       PreviousNumber=NextNumber;
		       NextNumber=Sum;
		       
		       ++i;
		       
			}
			
	   

}
}


