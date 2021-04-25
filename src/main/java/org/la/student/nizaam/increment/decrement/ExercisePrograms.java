package org.la.student.nizaam.increment.decrement;

public class ExercisePrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//8 what will be the value of a and b on printing
		int a = 3;
		int b = ++a;
		System.out.println(a);//4
		System.out.println(b);//4
		System.out.println("------------------");
	
	//9.what will be the value of a and b on printing	
		 a = -3;
		 b = a++;
		System.out.println(a);//-2
		System.out.println(b);//-3
		System.out.println("------------------");

	//10.what will be the value of a and b on printing	
		 a = 3;
		 b = ++a;
		System.out.println(a);//4
		System.out.println(b);//4
		System.out.println("------------------");		
	
	//11.what will be the value of a and b on printing	
		 a = 3;
		 b = ++a + 9;
		System.out.println(a);//4
		System.out.println(b);//13
		System.out.println("------------------");
	
	//12.what will be the value of a and b on printing	
		 a = 3;
		 b = a++ * 6;
		System.out.println(a);//4
		System.out.println(b);//18
		System.out.println("------------------");
		
	
	//13.	what will be the value of a and b on printing
		 a = 3;
		 b = a++ / 3;
		System.out.println(a);//4
		System.out.println(b);//1
		System.out.println("------------------");
	
		
	//14
		int x = 10;
		int y = -2;
		int z = ++x * y++;
		System.out.println(x);//11
		System.out.println(y);//-1
		System.out.println(z);//-22
		System.out.println("------------------");
	//15. 
		 x = 3;
		 y = 2;
		 z = x++ * y++;
		System.out.println(x);//4
		System.out.println(y);//3
		System.out.println(z);//6
		System.out.println("------------------");
	//16. 
		 x = -1;
		 y = 2;
		 z = --x * y++;
		System.out.println(x);//-2
		System.out.println(y);//3
		System.out.println(z);//-4
		System.out.println("------------------");
	//17. 
		 x = 0;
		 y = -2;
		 z = ++x * ++y;
		System.out.println(x);//1
		System.out.println(y);//-1
		System.out.println(z);//-1
		System.out.println("------------------");
	//18.
		 x = -3;
		 y = -2;
		 z = --x * y--;
		System.out.println(x);//-4
		System.out.println(y);//-3
		System.out.println(z);//8
		System.out.println("------------------");
	//19. 
		 x = 10;
		 y = -2;
		 z = ++x + y++;
		System.out.println(x);//11
		System.out.println(y);//-1
		System.out.println(z);//9
		System.out.println("------------------");
	//20. 
		 x = 10;
		 y = -2;
		 z = ++x / y++; 
		System.out.println(x);//11
		System.out.println(y);//-1
		System.out.println(z);//-5

	}

}
