package org.la.student.bakil.for_loop;

/*
 * Wap to check whether a number is Prime number or not.
 */
public class Question64 {

	public static void main(String[] args) {
	

		int i,x=0,y=0;      
		  int n=5;//it is the number to check
		  x=n/2;  //=1    
		  if(n==0||n==1){  
		   System.out.println(n+" is not prime number");      
		  }
		  else{  
			  
		   for(i=3;i<=x;i++){      
		    if(n%i==0)
		    {      
		     System.out.println(n+" is not prime number");      
		     y=1;      
		     break;      
		    }      
		   }      
		   if(y==0)  
		   { System.out.println(n+" is prime number"); 
		   }  
		  }//end of else 
	}}
