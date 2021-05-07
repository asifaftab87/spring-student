package org.la.student.barry.taks01;

public class TaskLogicalOperation10 {	/* 
	
		what will be the value of a and b on printing		
	*/

	public static void main(String[] args) {
		boolean lampX = false, result;
        boolean lampY = true;
        result = lampY || lampX;
        System.out.println("Lamp switch-on " + result);
        result = result && lampX;
        System.out.println("Lamp switch-on " + result);
	}

}
