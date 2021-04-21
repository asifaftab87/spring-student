package org.la.student.sadique.clas;

public class Methodtest3 {
	public static void main(String[] args) {
		float m = 34;
        float n = 56;
        float o = sum(m, n);
        System.out.println("o = " + o);
		
	}
	 public static float sum(float m, float n)
	    {
	        System.out.println("m = " + m + " n = " + n);
	        return m + n;
	    }

}
