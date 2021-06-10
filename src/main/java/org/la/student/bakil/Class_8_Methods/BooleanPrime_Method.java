package org.la.student.bakil.Class_8_Methods;
/*
 * boolean prime(int)
		check whether given number is prime or not and return true or false
 */
public class BooleanPrime_Method {


	public static void main(String[] args) {
	
		boolean result=prime(3,1);
		System.out.println(result);
		
	}

	
	static boolean prime(int a,int b)
	{
		while (b < a) {
			if (a % b == 0) {
				break;
			}
			b++;
		}
		if (a == b) {
		
			return true;
		}
		
		else {
			
		return false;
    }
		
		
	}
}
	
	
	

