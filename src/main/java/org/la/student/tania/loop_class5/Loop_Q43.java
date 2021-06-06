package org.la.student.tania.loop_class5;

public class Loop_Q43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  wap to find given number is prime or not
   
		
		 int i,x=0,y=0;      
		  int n=8;
		  x=n/2;  
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
		  }  
	}

}
