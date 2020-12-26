package org.la.student.sajid;

public class Array15 {
	public static void main(String[] args) {
		int a[]= {15,64,48,19,78};
		int m=a[0];;
		for(int i=0;i<a.length;i++) {
			if(m>a[i]) {
				m=a[i];
			}
		}System.out.println(m);
	}

}
