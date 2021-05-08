package org.la.student.noor;

public class IfElse10 {

	public static void main(String[] args) {
		boolean a, b, c;
        a = b = c = true;
        if( !a || ( b && c ) )
        {
            System.out.println("If executed");
        }
        else
        {
            System.out.println("else executed");
        }

	}

}
