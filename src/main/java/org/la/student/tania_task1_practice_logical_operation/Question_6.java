package org.la.student.tania_task1_practice_logical_operation;

public class Question_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
		boolean lampX = false, result;
        boolean lampY = true;
        result = lampY && lampX;
        System.out.println("Lamp switch-on " + result);
        result = lampY & lampX;
        System.out.println("Lamp switch-on " + result);

	}

}
