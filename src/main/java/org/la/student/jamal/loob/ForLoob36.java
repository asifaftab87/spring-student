package org.la.student.jamal.loob;

public class ForLoob36 {
	
	//36.	wap to print all upper case vowels.
	
	public static void main(String[] args) {
		

		for (char i='A'; i<'Z';i++) {
			if ((i=='V')||(i=='O')||(i=='W')||(i=='E')||(i=='L')) {
				System.out.println(i);
			}
			
		}
		
		char j='A';
		while (j<'z') {
			if ((j=='V')||(j=='O')||(j=='W')||(j=='E')||(j=='L')) {
				System.out.println("this is while : " +j);
			}
			j++;
		}
		

	}

}
