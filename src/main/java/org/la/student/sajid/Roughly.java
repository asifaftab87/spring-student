package org.la.student.sajid;

public class Roughly {
	public static void main(String[] args) {
		int r=3,d,swap=4;
		while(r>0){
			d=r%10;
			System.out.println(r);
			swap=swap*10+d;
			r=r/10;
			System.out.println(r);
	}}
}
