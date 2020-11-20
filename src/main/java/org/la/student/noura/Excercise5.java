package org.la.student.noura;

public class Excercise5 {

	public static void main(String[] args) {

		int c = 0, d = 50, e = 50;
		boolean b =(c==1) && (++e < 100);
		System.out.println("e="+e);
	    boolean f = (++e<100)&&(c==1);		
	    System.out.println("e="+e);
		
		
	    int z =0, x=50;
	    boolean v= (z==1)  || (++x<100);
	    System.out.println("x="+x);	    
	    boolean s =(x++>100)  || (z==1);
	    System.out.println("x="+x);	 
	  
	    int k=0 , q=50;
	    boolean g= (k==1) || (++q<100);
	    System.out.println("q="+q);	 
	    boolean m= (q++<100) || (k==1);
	    System.out.println("q="+q);	 



	    

	    

	}

}
