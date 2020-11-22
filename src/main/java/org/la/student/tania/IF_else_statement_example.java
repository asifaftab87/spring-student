package org.la.student.tania;

public class IF_else_statement_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Example1 
		
         //if_else statement
		int a=11;
		if (a%2==0) {
			System.out.println(a+ " it is an even"); //In this code either one of this statement will execute. 
		}                                            //If (if statement) is true it will skip (else statement).
		                                             //If (if statement) is false it will skip (if statement) and execute (else statement).
		  
		else {
			System.out.println(a+ " it is an odd");
		}
		System.out.println("End of this program");
		
		//Example 2
		
		int p=50;
		
		if(p>=60) {
			System.out.println("1st");
		}
		else {
			if(p>=50) {
				System.out.println("2nd");
			}
			else {
				if(p>=40) {
					System.out.println("3rd");
				}
					else {
						System.out.println("fail");
					}
				}
			}
		}
		
		
	}


