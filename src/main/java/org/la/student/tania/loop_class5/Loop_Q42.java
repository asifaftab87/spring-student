package org.la.student.tania.loop_class5;

public class Loop_Q42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //wap to print fibonocci series
		
		 int num1=0,num2=1,num3;
		 int count=20;    
		int i;	
		 System.out.print(num1+" "+num2);   
		    
		 for(i=2;i<count;++i)   
		 {    
		  num3=num1+num2;    
		  System.out.print(" "+num3);    
		  num1=num2; 
		  num2=num3;    
		 }  
	}

}
