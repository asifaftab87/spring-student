package org.la.student.abu;

public class reverseNO {
	public static void main(String[] args) {

		int i=5876;
		int s=0;
	while(i>0) {

			int r=i%10;

			i=i/10;
			s=s*10+r;

		}
		System.out.println(s);

	}

}

