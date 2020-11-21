package org.la.student.sadique;

public class RelationalOperator6 {

	public static void main(String[] args) {
		boolean lampX = false , result;
		boolean lampY = true;
		result =  lampY && lampX;
		System.out.println("Lamp switch-on"+result);
		result = lampY & lampX;
		System.out.println("Lamp switch-on"+result);
	}

}
