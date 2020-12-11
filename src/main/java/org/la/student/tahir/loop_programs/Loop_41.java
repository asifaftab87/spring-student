package org.la.student.tahir.loop_programs;

public class Loop_41 {

	public static void main(String[] args) {
		// wap to print all lower case alphabets except vowels.
		
				char a ='a';
				
				while (a<='z') {
					
					if(!(a=='a'||a== 'e' ||a== 'i' ||a=='o' || a=='u'))
						System.out.println(a);
					a++;
				}

	}

}
