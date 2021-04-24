package org.la.student.md;

public class Outputs4 {

	public static void main(String[] args) {
		
		int a = 4;
        a++;
        a += a;
        --a;
        a = 7 + a;
        a *= a;
        a -= 3;
		System.out.println(" a = " + a );
		
		int x = 4;
        x -= 10;
        x = -x;
        x = 7 + x;
        System.out.println(" x = " + x );
        x %= x;
        x = x * x - 3 ;
        System.out.println(" x = " + x );
        
     /*   	int f = (int)(-4);
		f=f+1;        
		f++;        
		f+=1;        
		++f; 
		System.out.println(" f = " + f ); */
	
		/*short s = 10;
        int a = s; 
        s += 10;
        System.out.println(s + "," + a); */
	
		/*short s = 10;
        int a = s;
        s = s + 10;
        System.out.println(s + "," + a);*/
	
	    int k = 0152;
        int b = --k / 2 * 2;
        System.out.println("k=" + k);
	}

}
