package org.la.student.barry.taks01;

public class TaskLogicalOperation21 {	/* 
	 what will be the value of a and b on printing		
	*/

	public static void main(String[] args) {
		int c = 20;
        double kelvin = c + 273.15;
        System.out.println(kelvin);
        int Rankine = (int) (c + 273.15 * 9 / 5);
        System.out.println(Rankine);
        double delisle = (100 - c) * 3 / 2;
        System.out.println(delisle);
	}
}
