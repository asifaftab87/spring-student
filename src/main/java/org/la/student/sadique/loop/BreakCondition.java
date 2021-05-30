package org.la.student.sadique.loop;
//31.	wap to give a condition that loop may be rotate upto 10 but break loop when it rotates uptop 7 times.
public class BreakCondition {
	public static void main(String[] args) {
	int u;
	for(u=1;u<=10;u++) {
		if(u==8)
			break;
		System.out.println("Loop Rotation "+u);
	} System.out.println("Break The Loop");
	}

}
