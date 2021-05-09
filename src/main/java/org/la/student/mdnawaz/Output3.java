package org.la.student.mdnawaz;

public class Output3 {

	public static void main(String[] args) {
		
		int x = 15 ;
		int y = x%4 ;
		int z = y*24 ;
		System.out.println(z/2); 
		
		int i = (int)34.0;
        int j = 7;
        int k = i % j;
        System.out.println("k = " + k );
        
        int f = 42;
        double g = 42.25;
		System.out.println("f mod 10 = " + f % 10 );
        System.out.println("g mod 10 = " + g % 10 );
        
        int a = 31, b = 40;
        int c = b - a;
        b = c % a;        
        b = b / a;        
        a = ++c;        
        b = (a - --b) * c;
        System.out.println("The value of b : " +b);
        
        int num = 69;
        int days = num % 30;
        int month = num / 30;
        System.out.println(month + " Month and " + days + " days");
        
        int A = 56;
        int B = -8;
        int C = A % B;
        int D = B % A;
        System.out.println(C + ", " + D);
        
        System.out.println(10 * 5 + 100 * (25 * 11) / (25 * 10) * 10 - 5 + 7 % 2);
		int zx = (10 * 5 + 100 * (25 * 11));
		int yz = ((25 * 10) * 10 - 5 + 7 % 2);
		System.out.println(zx / yz);
		
		int l = 34;
        double d = 20.5;
        d+=l;
        l+=d;
        d-=l;
        l-=d;
        System.out.println(" d = " + ++d );
        System.out.println(" l = " + l-- );

	}

}
