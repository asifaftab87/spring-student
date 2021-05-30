package org.la.student.nizaam.methods;

public class miscProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//20
		int a = 12 + 21 * 3 - 9 / 2;
        int b = 14 - 32 * 4 + 175 / 8 - 3;
        if(++a > 71 && --b < 20)
        {
            System.out.println("a = " + a + " b = " + b);
        }
        if(b-- == -97 || a-- < 100)
        {
            System.out.println("a = " + a + " b = " + b);
        }
		
     //21   
		float fl = 5.3f;
        if (fl == 5.3)
            System.out.println("Both are equal");
        else
            System.out.println("Both are not equal");
	//22		
		int first = 10, second=0;
        if (first < 10)
            second = 1;
        if (first >= 10)
            second = 2;
        System.out.println("y is " + second);
		
	//23	
        int x = 20;
        int y = 25;
        if (++x < (y = y -= 4) || (x = x += 4) > y) {
            System.out.println(x + "," + y);
        }
		
	//24.	
         x = 20;
         y = 25;
        if (++x < (y = y -= 4) || (x = x += 4) > y) {
            System.out.println(x + " " + y);
        }
		
	//25.	
        boolean x1 = true;
        boolean y1 = false;
        if (x1 && y1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
		
	//26.	
         x1 = true;
         y1 = false;
        if (x1 || y1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
	

	}

}
