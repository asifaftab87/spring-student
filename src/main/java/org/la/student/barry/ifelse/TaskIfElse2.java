package org.la.student.barry.ifelse;

public class TaskIfElse2 { /*
wap to find which number is greater among two numbers
*/

	public static void main(String[] args) {
		int a= 3;
		int b=2;
		int c= 1;
		if (a>b && a>c) { System.out.println("the number is great :"+ a);
		
	  } else if (b>a && b>c){
		System.out.println("the greatest number is :" +b);
	   }  else { System.out.println("the greatest number is :" +c);
	 }

   }
}
