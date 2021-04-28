package org.la.student.nizaam.relational.operator;

public class ExercisePrograms1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//11.
		int x = 9;
		System.out.println("result: "+(x==9 && ++x!=9)); //true

	//12. 
		x = -5;
		System.out.println("result: "+(x==-5 && ++x>-5)); //true
	
	//13. 
		int y = -1;
		 x = 5 * y++ ;
		System.out.println(x);//-5
		System.out.println(y);//0
	
	//14.	
		 y = -1;
		 x = -5 * ++y ;
		System.out.println(x);//0
		System.out.println(y);//0
		
	//15.	
		int a=1, b=2, c=-3;
		int s = ++a + b-- + c%3 ;
		System.out.println(a);//2
		System.out.println(b);//1
		System.out.println(c);//-3
		System.out.println(s);//4
		System.out.println("------------------");
	
	//16.	
		 a=1; b=2; c=-3;
		 s = a++ + b-- - c++ ;
		System.out.println(a);//2
		System.out.println(b);//1
		System.out.println(c);//-2
		System.out.println(s);//6
		System.out.println("------------------");
		
	//17.	
		 a=1; b=2; c=-3;
		 s = a++ + b-- * c++ ;
		System.out.println(a);//2
		System.out.println(b);//1
		System.out.println(c);//-2
		System.out.println(s);//-5
		
	
	}

}
