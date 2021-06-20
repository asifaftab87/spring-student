package org.la.student.asif.clas;

public class StringTest {

	public static void main(String[] args) {
		
		String s = "Train";
		System.out.println(s);
		System.out.println("uppercase: "+s.toUpperCase()); 
		System.out.println("uppercase: "+s.toLowerCase());
		char c = s.charAt(3);
		System.out.println(c);
		String sub = s.substring(2);
		System.out.println(sub);
		sub = s.substring(1, 3);
		System.out.println(sub);
		System.out.println(s);
		boolean b = s.equals("train");
		System.out.println(b);
		b = s.equalsIgnoreCase("train");
		System.out.println(b);
		String rev = reverse(s);
		System.out.println("rev: "+rev);
		
	}
	
	static String reverse(String s) {
		char[] a = s.toCharArray();
		char[] reverse = new char[a.length];
		for(int end=a.length-1, start=0 ; start<a.length ; start++, end--) {
			reverse[start] = a[end];
		}
		return new String(reverse);
	}
}
