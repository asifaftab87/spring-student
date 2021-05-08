package org.la.student.barry.taks01;

public class TaskLogicalOperation18 {	/* 
	 what will be the value of a and b on printing		
	*/

	public static void main(String[] args) {
		int x = 20;
        int y = 10;
        double z = x++ - y * 7 / --y + x * 10;
        System.out.println("z:" +z);
	}
}
