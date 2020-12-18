package org.la.student.noura.loop;

public class DiamondPattern {

	public static void main(String[] args) {

		int n = 4;
        int s = n - 1;
      
        for (int j = 1; j <= n; j++) 
        {
            for (int i = 1; i <= s; i++) 
            {
                System.out.print(" ");
            }
            s--;
            for (int i = 1; i <= 2 * j - 1; i++) 
            {
                System.out.print("*");                
            }
            System.out.println("");
        }
        s = 1;
        for (int j = 1; j <= n - 1; j++) 
        {
            for (int i = 1; i <= s; i++) 
            {
                System.out.print(" ");
            }
            s++;
            for (int i = 1; i <= 2 * (n - j) - 1; i++) 
            {
                System.out.print("*");
            }
            System.out.println("");
        }
	}	
}
