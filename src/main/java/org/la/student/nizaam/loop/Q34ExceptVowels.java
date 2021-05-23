package org.la.student.nizaam.loop;

public class Q34ExceptVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	34.	wap to print all upper case alphabets except vowels.
		
		for(char c='A';c<='Z';c++)
		{
			if(c!='A' && c!='E' && c!='I' && c!='O' && c!='U')
				System.out.println(c);
		}
			

	}

}
