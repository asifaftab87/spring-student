package org.la.student.nizaam.relational.operator;

public class ExercisePrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//4.	
		int a = 10;
        int b = 15;
        a++;
        b--;
        int c = b % a;
        System.out.println(c >= b);//false
        System.out.println("------------------");
		
	//5.	
         a = 10;
		boolean x = a++==10;
		boolean y = --a==10;
		System.out.println(a);//10
		System.out.println(x);//true
		System.out.println(y);//true
		System.out.println("------------------");
	
	//6.	
		 a = 10;
		 b = 3;
		 x = a++==10 && ++b==4;
		 y = --a==10 || b--<4;
		System.out.println(a);//10
		System.out.println(b);//4
		System.out.println(x);//true
		System.out.println(y);//true
		System.out.println("------------------");
	
	//7.	
		 a = 10;
		 b = 3;
		 x = a++==10 && ++b==4;
		 y = --a==10 || b--<4;
		System.out.println(a);//10
		System.out.println(b);//4
		System.out.println(x);//true
		System.out.println(y);//true
		System.out.println("------------------");
		
	//8.	
		 a = -4;
		 b = 0;
		 x = a< -5 && b==4;
		 y = --a > -6 || b-- < -1;
		System.out.println(a);//-5
		System.out.println(b);//0
		System.out.println(x);//false
		System.out.println(y);//true
		System.out.println("------------------");
		
	//9.	
		 a = -1;
		 b = 1;
		 x = ++a<=0 && ++b>1;
		 y = --a > -2 || b-- < 1;
		System.out.println(a);//-1
		System.out.println(b);//2
		System.out.println(x);//true
		System.out.println(y);//true
		System.out.println("------------------");
		
	//10.	
		 a = -1;
		 x = a!=-2 && ++a==0;
		System.out.println(a);//0
		System.out.println(x);//true
	

		
		

	}

}
