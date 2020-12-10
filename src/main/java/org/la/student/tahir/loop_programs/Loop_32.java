package org.la.student.tahir.loop_programs;

public class Loop_32 {

	public static void main(String[] args) {
		//wap to print negative number among two given numbers( with if and without if).
		
		int a=-1, b=2;
		if (a<0) 
			System.out.println(a +" is negative");
			else if(b<0) {
				System.out.println(b +" is nagative");
	//without if	
int c= (a<0?a:(b<0?b:0));
System.out.println(c+ " is negative");
	}

	}

}
