package org.la.student.noura;

public class Excercise4 {

	public static void main(String[] args) {

		
		boolean a =true;
		boolean b =true;
		boolean c =true;
		boolean d =false;
		boolean e = a || !b || c || !d;
		System.out.println(e);
		
		
		boolean lampx = false, result;
		boolean lampy = true;
		result = lampy || lampx;
		System.out.println("lamp switch-on=" +result);
		result = lampy && lampx;
		System.out.println("lamp switch-on=" +result);


		
		
		
		
		
	}

}
