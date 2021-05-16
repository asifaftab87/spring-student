package org.la.student.tania;

public class Array7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char src[] = {'q', '2', '%', '-'};
		char tar[] = new char[src.length];
		
		int l = src.length-1;
		
		for(int i=0 ; i<src.length ; i++) {
			tar[i] = src[l-i];
		}
		
		for(char c : tar) {
			System.out.println(c);
		}
	}

}
