package org.la.student.noura.ifelse;

public class WithandwithoutIf {
	
	
	public static void main(String[] args) {
		
		//wap to print greatest number among two given numbers( with if and without if)
	
		
		int a=4  , b=50;
		
		if (a>b)
		{
			System.out.println(a+ "  is the greatest number");
		}
		else 
		{
			System.out.println(b+"  is the greatest number");
		}
		
		
		
		
		int d=60  , c=10;
		int great= d>c? d:c;
		System.out.println("the greatest number is  "+great);
		
		
	}

}