package org.la.student.tahir.loop_programs;

public class For_Loop_32 {

	public static void main(String[] args) {
		// wap to print all upper case alphabets except vowels.
		
		
		for(char a='A'; a<='Z'; a++) {
					
					if(!(a=='A'||a== 'E' ||a== 'I' ||a=='O' || a=='U'))
						System.out.println(a);
					
				}
	}

}
