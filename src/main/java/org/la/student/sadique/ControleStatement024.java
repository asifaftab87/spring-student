package org.la.student.sadique;

public class ControleStatement024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=20;
		int y=25;
		if (++x<(y=y-=4) || (x=x+=4)>y) {
			System.out.println(x+","+y);
		}

	}

}
