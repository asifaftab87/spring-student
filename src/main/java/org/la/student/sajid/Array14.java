package org.la.student.sajid;

public class Array14 {
	public static void main(String[] args) {
//		14) wap to find greatest number from any array .
		int a[]= {90,50,10};
		int m=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>m)
				m=a[i];
		}System.out.println(m);
	}

}
