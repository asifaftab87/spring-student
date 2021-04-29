package org.la.student.barry.cond;

public class IfExample4 {

	public static void main(String[] args) {
		
		char race = 'e';  //Asian
		char location= 'l';
		System.out.println("Program started for checking race");
		
	

    	if (race=='c' || race=='a') {
		System.out.println("Chinese Asian");
	   }
 
	  if ((race=='b' || race=='e') && location=='m') {
		System.out.println("British");
    	}
	  if (race=='a' && location=='m') {
			System.out.println("Arab");
        }
	   System.out.println("race:" +race);
 

	}

}
