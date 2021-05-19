package org.la.student.sadique.clas;

public class GradeMarks {

	public static void main(String[] args) {
		int marks = 80;
        if( marks > 70 ) {
            System.out.println("Distinction");}
        
        else if( marks > 35 ) {
            System.out.println("Pass");}
        else {
            System.out.println("Fail");
            System.out.println("Better luck next time");}
	}

}
