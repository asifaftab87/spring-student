package org.la.student.noura.clas;

public class Prime {

	

 
 static void checkPrime(int n){  
	  int i;
	  int r=0;
	  int flag=0;      
	  
	  r=n/2;      
	  
	  if(n==0||n==1)
	  {  
	   System.out.println(n+" is not prime number");      
	  }
	  
	  else
	  {  
	     for(i=2;i<=r;i++)
	     {      
	        if(n%i==0)
	        {      
	               System.out.println(n+" is not prime number");      
	           flag=1;      
	           break;      
	        }      
	     }      
	  
	     
	            if(flag==0)  { System.out.println(n+" is prime number"); }  
	  
	  }//end of else  
	}  
 
	
}
