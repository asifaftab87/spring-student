package org.la.student.tahir.loop_programs;

public class Loop_33 {

	public static void main(String[] args) {
		// wap to print positive number among two given numbers( with if and without if).
		
		int a=-1, b=-2;
		if (a>0) 
			System.out.println(a +" is positive");
			else if(b>0) {
				System.out.println(b +" is positive");
	//without if	
int c= (a>0?a:(b>0?b:0));
System.out.println(c+ " is positive");
	}


	}

}
