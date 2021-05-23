package org.la.student.barry.loop.task;

public class Loop43 {
	
	// wap to find given number is prime or not
	public static void main(String[] args) {
		  int x,y=0,z=0;      
		  int n=5; //it is the number to be checked    
		   y=n/2;    
		   
		  if(n==0||n==1){  
		   System.out.println(n+" is not prime number");      
		  }else{  
		   for(x=2;x<=y;x++){      
		    if(n%x==0){      
		     System.out.println(n+" is not prime number");      
		     z=1;      
		     break;      
		    }      
		   }      
		   if(z==0)  { System.out.println(n+" is prime number"); }  
		  }   //end of else  program
     }
	}
  

	
	
