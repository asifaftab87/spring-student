package org.la.student.jamal.loob;

public class ForLoob34 {
	
	//32. wap to print all lower case alphabets.
	
	public static void main(String[] args) {
		

		for (char i='A'; i<='Z';  i++) {
			if ((i!='V')&&(i!='O')&&(i!='W')&&(i!='E')&&(i!='L')) {
				System.out.println(i);
			}
			
		}
		char j='A';
		while (j<='Z') {
			if ((j!='V')&&(j!='O')&&(j!='W')&&(j!='E')&&(j!='L')) {
				System.out.println("this is while : " +j);
				
		}
			
			j++;
		}
		//34.	wap to print all lower case alphabets except vowels.
		
		for (char n='a';n<='z';n++) {
			if ((n!='v')&&(n!='o')&&(n!='w')&&(n!='e')&&(n!='l'))
			System.out.println(n);
		}
		
		char k='a';
		while (k<='z') {
			if ((k!='v')&&(k!='o')&&(k!='w')&&(k!='e')&&(k!='l')) {
				System.out.println("this is while : " +k);
				
		}
			
			k++;
		}
		

	}

}
