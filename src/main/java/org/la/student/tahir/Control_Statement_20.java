package org.la.student.tahir;

public class Control_Statement_20 {

	public static void main(String[] args) {
	
		int x = 20;
		int y = 25;
		if (++x<(y = y -= 4) || (x = x += 4)>y) {
			
			System.out.println(x + " " + y);
		}

	}

}
