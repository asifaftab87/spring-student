package org.la.student.sajid;

public class ControlStatementWap43 {
	public static void main(String[] args) {
		int a=10;
		int b=988;
		if(a>99 && a<=999) {
			a=(a<999 && a>=100)?a:b;
		    System.out.println("A= "+a);
		    }
		
	    if(b>99 && b<=999) 
		{
	    	b=(b<999 && b>=100)?b:a;
		    System.out.println("B= "+b);
		}
	}

}
