package org.la.student.tahir.loop_programs;

public class Loop_40 {

	public static void main(String[] args) {
		// wap to print all upper case alphabets except vowels.
		
		char a ='A';
		
		while (a<='Z') {
			
			if(!(a=='A'||a== 'E' ||a== 'I' ||a=='O' || a=='U'))
				System.out.println(a);
			a++;
		}

	}

}
