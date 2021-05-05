package org.la.student.noor;
//wap to give a condition that loop may be rotate upto 10 but break loop when it rotates upto 7 times.



public class WhileLoop19 {

	public static void main(String[] args) {
		int i=1;
		while(i<=10) {
			if(i==7) {
				break;
			}
			System.out.println(i);
			i++;
		}

	}

}
