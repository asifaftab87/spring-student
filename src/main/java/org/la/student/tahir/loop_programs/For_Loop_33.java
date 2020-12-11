package org.la.student.tahir.loop_programs;

public class For_Loop_33 {

	public static void main(String[] args) {
		// wap to print all lower case alphabets except vowels.
		
		for(char a='a'; a<='z'; a++) {
			
			if(!(a=='a'||a== 'e' ||a== 'i' ||a=='o' || a=='u'))
				System.out.println(a);
			
		}
	}

}
