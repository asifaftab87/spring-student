package org.la.student.sadique.clas;

public class Qno30 {

	public static void main(String[] args) {
		int marks = 25;
        if( marks > 70 )
        {
            System.out.println("Distinction");
            System.out.println("Congratulations");
        }
        else if( marks > 35 )
        {
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
            System.out.println("Better luck next time");
        }
	}

}
