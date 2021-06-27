package org.la.student.bakil.if_else;
/*
 *      
 * */
public class Question22 {

	public static void main(String[] args) {
		
		int x = 20;
        int y = 25;
        if (++x < (y = y -= 4) || (x = x += 4) > y) //21||25
        {
            System.out.println(x + "," + y);
        }
       
	}

}
