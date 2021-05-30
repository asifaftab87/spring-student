package org.la.student.sadique.loop;
//wap to reverse a number e.g ip=12345, op=54321 avoid zero
public class ReverseNumber {

	public static void main(String[] args) {
		int z=123456;
		int s=0;
		for(;z>0;) {
			int r=z%10;
			z=z/10;
			s=s*10+r;
		}
		System.out.println(s);

	}

}
