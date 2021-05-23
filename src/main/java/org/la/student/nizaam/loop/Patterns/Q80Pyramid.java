package org.la.student.nizaam.loop.Patterns;

public class Q80Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j,k;
		
		for (i = 0; i < 6 + 1; i++) { 
			
				for (j = 6; j > i; j--) {
					System.out.print(" ");
				}	
				for (k = 0; k < (2 * i - 1); k++) {
		            System.out.print("*");
		        }

				System.out.println();
        }
                
    
	}

}
