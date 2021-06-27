package org.la.student.bakil.for_loop;

/*
 * wap to print Fibonacci series
 */
public class Question40 {

	public static void main(String[] args) {
	
		
		 int num1=0,num2=1,num3,i,count=10;    
		
		 System.out.print(num1+" "+num2);//printing 0 and 1    
		    
		 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  num3=num1+num2;    
		  System.out.print(" "+num3);    
		  num1=num2; //n1=13
		  num2=num3;    //n2=21
		 }  
	}

}
