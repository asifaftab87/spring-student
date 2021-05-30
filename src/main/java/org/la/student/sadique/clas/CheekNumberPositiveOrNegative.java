package org.la.student.sadique.clas;

public class CheekNumberPositiveOrNegative {

	public static void main(String[] args) {
		// wap to print zero if number zero, 1 if positive and -1 if number is negative.
		int num =10;
		if(num>-1&&num>0) {
			System.out.println(num+" Is positive number");
		}else if(num==0){
			System.out.println(num+" Is zero number");
		}else if(num<0) {
			System.out.println(num+" Is negative number");
		}
	}

}
