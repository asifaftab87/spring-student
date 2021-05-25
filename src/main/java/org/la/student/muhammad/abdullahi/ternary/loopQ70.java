package org.la.student.muhammad.abdullahi.ternary;

public class loopQ70 {
	public static void main(String[] args) {
		
		 
		  
		int num1=1, num2=1000;

	      for (int i = num1; i<num2; i++){
	         int check, c, sum = 0;
	         check = i;
	         while(check != 0) {
	            c = check % 10;
	            sum = sum + (c * c * c);
	            check = check / 10;
	         }
	         if(sum == i){
	            System.out.println(""+i+" is an Armstrong number.");
	         }
		
		
			}
		
	}   
	}
		
	
		
		
		
		
		
		
		
		
		
		
	

