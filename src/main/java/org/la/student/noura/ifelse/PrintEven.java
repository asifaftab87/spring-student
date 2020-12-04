package org.la.student.noura.ifelse;

public class PrintEven {

	public static void main(String[] args) {

		//wap to print even number among two given numbers( with if and without if)
		
		int d=3 ,  c= 5;
		
		if (d%2==0&&c%2==0)
		{
			System.out.println("both are even number");
		}
		else if(d%2==0)
		{
			System.out.println(d+"  is even number");

		}
		else if(c%2==0)
		{
			System.out.println(c+"    is even number");

		}
		else 
		{
			System.out.println("not even number");

		}
		
		
		
		// without if
		
		int a=4 , b=7;
		
		int even = (a%2==0) ?  a : ( b%2==0 ? b : -1) ;
		System.out.println(even);
		
	}

}
