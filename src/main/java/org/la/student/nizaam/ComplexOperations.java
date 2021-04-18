package org.la.student.nizaam;

public class ComplexOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//14.	
		int x = 15;
        int y = x % 4;
        int z = y * 24;
        System.out.println(z / 2);//36
        System.out.println("------------------");
	
	//15.	
		int i = (int)34.0;
        int j = 7;
        int k = i % j;
        System.out.println("k = " + k );//6
        System.out.println("------------------");
	//16.	
		int x1 = 42;
        double y1 = 42.25;
		System.out.println("x mod 10 = " + x1 % 10 );//2
        System.out.println("y mod 10 = " + y1 % 10 );//2.25
        System.out.println("------------------");
	//17.	
		int a = 31, b = 40;
        int c = b - a;//9
        b = c % a;   //9   
        b = b / a;    //0    
        a = ++c;        //10
        b = (a - --b) * c;//110
        System.out.println("a value :"+a);//10
        System.out.println("b value :"+b);//110
        System.out.println("c value :"+c);//10
        System.out.println("------------------");
	//18.	
		int num = 69;
        int days = num % 30;//9
        int month = num / 30;//2
        System.out.println(month + " Month and " + days + " days");
        System.out.println("------------------");
    //19.	
		int a1 = 56;
        int b1 = -8;
        int c1 = a1 % b1;//0
        int d1 = b1 % a1;//-8
        System.out.println(c1 + ", " + d1);
        System.out.println("------------------");
	//20.	
		//System.out.println(10  5 + 100  (25  11) / (25  10) * 10 - 5 + 7 % 2);
		//int zx = (10  5 + 100  (25 * 11));
		//int yz = ((25  10)  10 - 5 + 7 % 2);
		//System.out.println(zx / yz);
	}

}
