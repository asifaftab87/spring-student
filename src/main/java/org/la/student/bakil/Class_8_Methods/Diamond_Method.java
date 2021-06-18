package org.la.student.bakil.Class_8_Methods;
/*
 * int sub(int, int) - subtract two numbers and return result
 */
public class Diamond_Method {


	public static void main(String[] args) {
	
		int n=5;
		diamond(n);
		
	}

	
	 static void diamond(int n) {
	
		 for(int i=-n ; i<=n ; i++) {

				int j=i;
				if(j<0){
					j = -j;
				}

				//printing space
				for(int k=1 ; k<=j ; k++) {
					System.out.print(" ");
				}
				//printing star
				for(int k=0 ; k<=n-j ; k++) {
					System.out.print("* ");
				}
				System.out.println("");
		}
	}
	
	}

