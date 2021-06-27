package org.la.student.bakil.for_loop;

/*
 * Wap to find power of a number using for loop.
 */
public class Question62 {

	public static void main(String[] args) {
	

		int base = 3;

        long result = 1;

        for (int exp=7;exp != 0;exp--)
        {
            result *= base; //1*3*3*3*3*3
           
        }

        System.out.println("The power of  "+base + " = "+result);
    
		}
	}
	

