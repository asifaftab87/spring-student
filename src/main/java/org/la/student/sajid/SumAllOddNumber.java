package org.la.student.sajid;

public class SumAllOddNumber {
	public static void main(String[] args) {
		int n=11,s=0;
		for(int a=1;a<=n;a++) {
			if(a%2!=0) {
				s=s+a;
			}
		}System.out.println(s);
	}

}
