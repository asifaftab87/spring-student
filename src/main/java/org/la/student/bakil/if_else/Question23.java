package org.la.student.bakil.if_else;
/*
 *      
 * */
public class Question23 {

	public static void main(String[] args) {
		
		int x = 20;
        int y = 25;
        if (++x < (y = y -= 4) || (x = x += 4) > y) //21 <21||25>21
        {
            System.out.println(x + " " + y);
        }
        
       
	}

}
