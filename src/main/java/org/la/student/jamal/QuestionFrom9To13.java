package org.la.student.jamal;

public class QuestionFrom9To13 {

	public static void main(String[] args) {
		
		
		int math =85;
		int physics=70;
		int philosophy= 90;
		double sport= 95.7;
		
		//9.	wap to find average of 3 numbers?
		
		int ans9 = (math + physics + philosophy)/3 ;
		
        System.out.println("These is the answer of question number 9:  " +ans9+"%");
		
		System.out.println("__________________________________________________");
		
		//10.	wap to find average of 4 numbers?

		double ans10 = (math + physics + philosophy+ sport)/4 ;
		
        System.out.println("These is the answer of question number 10:  " +ans10+"%");
		
		System.out.println("__________________________________________________");
		
		//11.	wap to find average of 2 numbers?
		
        double ans11 = ( philosophy+ sport)/2 ;
		
        System.out.println("These is the answer of question number 11:  " +ans11+"%");
		
		System.out.println("__________________________________________________");
		
		//12. what will be output: int x = 5 + 3 * 4 / 5 + 4;
		
		int x= 5+3*4/5+4;
		double ans12= 5+3*4.0/5+4;
		
		System.out.println("These is the answer of question number 12:  " + x);
        System.out.println("These is the real answer of question number 12:  " + ans12);
		
		System.out.println("__________________________________________________");
		
		// 13.	what will be output: double x = 14 / 5 ;
		
		double ans13 = 14/5;
		double rans13 = 14.0/5;
		
        System.out.println("These is the answer of question number 13:  " +ans13);
        System.out.println("These is the real answer of question number 13:  " + rans13);
		
		System.out.println("__________________________________________________");
		
	
		
	}

}
