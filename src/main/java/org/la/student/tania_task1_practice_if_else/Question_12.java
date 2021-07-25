package org.la.student.tania_task1_practice_if_else;

public class Question_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//11.wap to find smallest number among 2 numbers
		int a=2,b=7,c=1;
		if(a<b && a<c) {
			System.out.println("the smallest number is=" +a );
		}
		
		else if(b<a && b<c){
			System.out.println("the smallest number is=" +b);
		}
		else {
			System.out.println("The smallest number is="+c);
		}
	}

}
