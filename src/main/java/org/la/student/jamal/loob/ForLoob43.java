package org.la.student.jamal.loob;

public class ForLoob43 {
	
	//43.	wap to reverse a number e.g ip=12345, op=54321 avoid zero
	
	public static void main(String[] args) {
		

		int n=12345;
		int res=0;
		for (;n>0;) {
			int r=n%10;
			n=n/10;
			res=res*10+r;
		}
		System.out.println("reverse num : " + res);
		
		int m=12345;
		int ans=0;
		while (m>0) {
			int y = m%10;
			m=m/10;
			ans=ans*10+y;
		}
		System.out.println("reverse num with while : " + ans);

	}

}
