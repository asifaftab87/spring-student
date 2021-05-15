package org.la.student.barry.loop.task;
public class Loop68 {
	
	//Wap to check whether a number is Prime number or not.
	public static void main(String[] args) {
		
		 int i,m=0,f=0;      
		  int n=5;//it is the number to be checked    
		  m=n/2;      
		  if(n==0||n==1){  
		   System.out.println(n+" is not prime number");      
		  }else{  
		   for(i=2;i<=m;i++){      
		    if(n%i==0){      
		     System.out.println(n+" is not prime number");      
		     f=1;      
		     break;      
		    }      
		   }      
		   if(f==0)  { System.out.println(n+" is prime number"); }  
		  }//end of the program  
   }
}
	
  

	
	
