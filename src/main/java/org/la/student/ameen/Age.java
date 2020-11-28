package org.la.student.ameen;

public class Age {

	public static void main(String[] args) {
		// wap to print kid if age<13, print teenage if age<18 and age>12, and adult if age>18
		int age = 12;
		if(age < 13 )
		{
			System.out.println("kid");
		}
		else if(age >13 && age < 18)
		{
			System.out.println("teenage");
		}
		else 
		{
			System.out.println("adult");
		}
		}

}
