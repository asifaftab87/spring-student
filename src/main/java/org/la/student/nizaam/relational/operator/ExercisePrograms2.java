package org.la.student.nizaam.relational.operator;

public class ExercisePrograms2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//18.	
				boolean x = false, y = true;
				boolean r = x==false;
				boolean p = y!=true;
				System.out.println(x);//false
				System.out.println(r);//true
				System.out.println(p);//false
				System.out.println("------------------");
				
			//19.	
				 x = false; y = true;
				 r = x==true;
				 p = y==true;
				System.out.println(x);//false
				System.out.println(r);//false
				System.out.println(p);//true
				System.out.println("------------------");

			//20.	
				 x = false; y = true;
				 r = x==false && y!=true;
				System.out.println(x);//false
				System.out.println(y);//true
				System.out.println(r);//false
				System.out.println("------------------");
				
				
			//21.	
				 x = false; y = true;
				 r = x && y;
				System.out.println(r);//false


	}

}
