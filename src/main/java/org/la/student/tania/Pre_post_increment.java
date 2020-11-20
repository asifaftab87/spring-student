package org.la.student.tania;

public class Pre_post_increment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pre increment
		
//wap to do pre increment a number and assign its value to other number and print both number
		int a=6;
		++a;
		int b=a;
	System.out.println(b);
		
//wap to pre increment a number n multiply with a number and assign product to a variable, print both variables
	int c=2;
	int d= ++c*3;
	System.out.println(d);
		

//wap to do pre increment a number and assign its value to other number and print both numbers, do assignment increment in same line
	int x=5;
	int y=++x;
	System.out.println(y);
	
//wap to do post increment a number and assign its value to other number and print both numbers, do assignment increment in same line
	int w = 3;
	int v = w++;
	System.out.println(v);
	
	
//wap to do post increment a number and assign its value to other number and print both number
	int m=8;
     m++;
	System.out.println(m);
	
//wap to post increment a number n multiply with a number and assign product to a variable, print both variables
	int e= 3;
	int f=e++*4;
	System.out.println(f);

	}

}
