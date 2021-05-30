package org.la.student.nizaam.methods;

import java.util.Arrays;

public class Q33reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char c[] = {'a','b','c','d','e'};
		char a[]= reverse(c);
		System.out.println(Arrays.toString(a));
	}

	static char[] reverse(char c[]) {
		char res[] = new char[c.length];
		
		for(int i=0,j=c.length-1;i<c.length;i++,j--) {
			res[i]=c[j];
		}
		return res;
	}
}
