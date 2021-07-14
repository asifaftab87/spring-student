package org.la.student.ameen;
import java.util.Scanner;
public class FindTables {

	public static void main(String[] args) {
		// Tables of multiplication of number 
		
		int num ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to get your required multiplication table ");
		
		num = sc.nextInt();
		
		for(int i = 1 ; i <=10 ; i++)
		{
			System.out.println(+num + " * " +i + " = " +(num *i));
		}
		 

	}

}
