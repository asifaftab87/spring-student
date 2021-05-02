package org.la.student.barry;

public class Question9arithmetic26 {
	/*
	 * 	short s = 10;
        int a = s;
        s = s + 10;
        System.out.println(s + "," + a);
	 * */
	public static void main(String[] args) {
		short s = 10;
        int a = s;
        s = (short)((short)(int)s + 10);
        System.out.println("S:"+ s + "," + a);
	
	}

}
