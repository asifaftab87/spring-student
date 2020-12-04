package org.la.student.noura.ifelse;

public class PrintOddNumber {

	public static void main(String[] args) {

//wap to print odd number among two given numbers( with if and without if)
		
		int z=45 , x= 98;
	
			if (z%2!=0 && x%2!=0)
			{
				System.out.println("both are odd number");
			}
			else if(z%2!=0)
			{
				System.out.println(z+"  is odd number");

			}
			else if(x%2!=0)
			{
				System.out.println(x+"    is odd number");

			}
			else 
			{
				System.out.println("not odd number");

			}
			
			//without if
			
			
			int a=6 ,b=5;
			int odd= a%2!=0? a:(b%2!=0?b:-1);        
			System.out.println(odd);
	}

}
