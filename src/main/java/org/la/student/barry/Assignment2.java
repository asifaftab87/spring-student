package org.la.student.barry;

public class Assignment2 {
	public static void main(String[] args) {
		
		//wap to create and print an int variable?
		
		int a= 1;
	   System.out.println("a:"+ a);
	 //wap to create and print a char variable?
	 
	   char c= 'z';
	   
	   System.out.println("c:"+ c);
	  
	  //wap to create and print a float variable?
	   
	   float f= 2.5f;
	    System.out.println("f: "+ f);
	    //wap to create and print a short variable? 
	    
	    short s=254;
	    System.out.println("s:" + s);
	    //wap to create and print a boolean variable?
	     boolean val1= 2>5;
	     boolean val2= 8>7;
	     System.out.println("is 2>5 ? answer is:" + val1);
	     System.out.println("is 8>7 ?answer is:"+ val2);
	     //wap to create and print a double variable?
	     
	     double d=35.741;
	     System.out.println("d :"+ d);
	    
	     //wap to create and print a long variable?
	     long l= 25555555l;
	     System.out.println("l:"+l);
	     
	     int b= 'A';
	     System.out.println("b:" + b);
	     char e= 66;
	     System.out.println("e:" + e);
	     int i= 19/5;
	     System.out.println("i: " + i);
	     
	     int num1=35,num2=15,num3=10, sum;
	    //3. wap to subtract two numbers?
	    sum=num1-num2;
	    
	    System.out.println("Subtract of two numbers= "+ sum);
	     //4. wap to subtract three numbers?
	   sum= num1-num2-num3;
	    System.out.println("Subtract three numbers= "+ sum);
	    //5. wap to multiply two numbers?
	    sum= num1*num2;
	    System.out.println("Multiply two numbers="+ sum);
	    		//6. wap to multiply three numbers?
	    sum= num1*num2*num3;
	    System.out.println("Multiply Three numbers="+ sum);
	     //wap to find remainder of a given numbers?
	    int r=10%3;
	    System.out.println("remainder:"+ r);
	    /*wap to find percentage?
	    9. wap to find average of 3 numbers?
        10. wap to find average of 4 numbers?
        11. wap to find average of 2 numbers*/
	    //12.	what will be output: int x = 5 + 3 * 4 / 5 + 4;
	    
	    int x = 5 + 3 * 4 / 5 + 4;
	    System.out.println("X: "+ x);
	    
		//13.	what will be output: double x = 14 / 5 ;
	    double y = 15 /5;
	    System.out.println("Y" + y);
	    
	    int o = 15;
	    int p = o % 4;
	    int q = p * 24;
	    System.out.println(q/ 2);
	    
	  int h=(int)34.0;
	    int j = 7;
	    int k = h% j;
	    System.out.println("k = " + k );
	    
	    int t = 42;
	    double u = 42.25;
	    System.out.println("t mod 10 = " + t % 10 );
	    System.out.println("u mod 10 = " + u % 10 );
	  
	    int m = 31, n= 40;
	    int w = b - m;
	    n = w % m;
	    n = n / m;
	    m = ++w;
	    n = (m - --n) * w;

	   int num = 69;
	    int days = num % 30;
	    int month = num / 30;
	    System.out.println(month + " Month and " + days + " days");

	    int aa= 56;
	    int bb= -8;
	    int cc= aa% bb;
	    int dd= bb% aa;
	    System.out.println(cc+ ", " +dd);

	     
	}

}
