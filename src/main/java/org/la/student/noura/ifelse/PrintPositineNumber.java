package org.la.student.noura.ifelse;

public class PrintPositineNumber {

	public static void main(String[] args) {
		//wap to print positive number among two given numbers( with if and without if)
		int a=30;
		int b=-3;
		
		if (a>0&&b>0)
		{
			System.out.println(" both are positive numbers");
		}
		
		else if (a>0)
		{System.out.println(a+"   is  positive number");}
		
		else if (b>0)
		{System.out.println(b+"   is  positive number");}
		
		else
			
		{
			System.out.println("both numbers are negative");

		}
		
	
		
		//without if
		
		
		int x= -6 , z= 20;
		int negativeNum = (x>0)? x : ((z>0) ? z : 0) ;
		System.out.println(negativeNum);
		
		// (b<0 ? b : 0)   -> false part I put as zero, just an indication that neither a nor b is negative 
        //a<0? a : (b<0 ? b : 0) ;
		//we can divide above expression in these parts
		//1. first checking whether a is less than zero or not, if yes then true part is a means it is negative num
		//2. if a is not less than zero then false part will execute so we will come to false ->  (b<0 ? b : 0) part which is again a ternary operator 
		//3. now it will execute b<0, if true the answer is true part which is b 
		//4. there may be a chance that b also not negative then in this situation false part will execute, n just an indication I mentioned zero that none of them negative 
		
		
	}

}
