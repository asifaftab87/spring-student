package org.la.student.jamal;

public class Question9 {
	
	//9.	wap to find average of 3 numbers? 

	public static void main(String[] args) {
		
	
		
		int math =85;
		int physics=70;
		int philosophy= 90;
		double sport= 95.7;
		
		
		
		int ans9 = (math + physics + philosophy)/3 ;
		double ans = (math + physics + philosophy + sport)/4 ;
		
		System.out.println(ans);
		
        System.out.println("These is the answer of question number 9:  " +ans9+"%");
        
        double ans1 = math + physics + philosophy + sport ;
        
        System.out.println("ansr1 : " + ans1*100/400 );
		
        
      
	}

}
