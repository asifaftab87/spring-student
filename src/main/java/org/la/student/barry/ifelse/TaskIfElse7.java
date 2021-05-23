package org.la.student.barry.ifelse;

public class TaskIfElse7 { /*
wap to find to find greatest among three numbers
*/

	public static void main(String[] args) {
		int a= 40, b = 18, c= 15;
		
		if (a>b && a>c) {
			System.out.println("the greatest number is: " + a);
		}	else if(b>c) {
			System.out.println("the greatest number is: " + b);
		}
		
	    else { System.out.println("the grestes numbe is:" + c);
              }
    }
}