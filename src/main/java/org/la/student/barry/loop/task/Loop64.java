package org.la.student.barry.loop.task;
public class Loop64 {
	
	//Wap to check whether a number is palindrome or not
	public static void main(String[] args) {
		
		 int r,sum=0,temp;    
		  int n=454;//It is the number variable to be checked for palindrome  
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
     }
}

	
  

	
	
