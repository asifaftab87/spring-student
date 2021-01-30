package org.la.student.tahir.method;

public class VowelorConsonant {
	// Vowel or Consonant
	public static void main(String[] args) {
	
		char x= 'E';
		character(x);
		
	}
	
	static void character(char a ) {
	
		if((a=='a'||a=='A') || (a=='e'||a=='E') || (a=='i'|| a=='I') || (a== 'o'|| a=='O') || (a=='u'||a=='U')) {
			System.out.println("The character is vowel");
		}
		
		else
			System.out.println("The character is consonant");
		
		
	}

}
