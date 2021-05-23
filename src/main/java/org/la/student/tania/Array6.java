package org.la.student.tania;

public class Array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char src[] = {'q', '2', '%', '-'};
		char tar[] = new char[src.length];
		
		for(int i=0 ; i<src.length ; i++) {
			tar[i] = src[i];
		}
		
		for(char c : tar) {
			System.out.println(c);
		}
	}

}
