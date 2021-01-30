package org.la.student.noura.loop;

public class CheckWhetherNumberisPalindrome {

	public static void main(String[] args) {


		int num = 134;
		int reversedInteger = 0;
		int r;
		int originalInteger= num;

        
		

        // reversed integer is stored in variable 
        while( num != 0 )
        {
            r = num % 10;
            reversedInteger = reversedInteger * 10 + r;
            num  /= 10;
        }

        // palindrome if orignalInteger and reversedInteger are equal
        if (originalInteger == reversedInteger)
            System.out.println(originalInteger + " is a palindrome.");
        else
            System.out.println(originalInteger + " is not a palindrome.");
	}

}
