package org.la.student.rasheed.clas;

public class StringTest {

	public static void main(String[] args) {
		//if you write the name only, it will print
		String s = "Train";
		System.out.println(s);
		System.out.println("uppercase: "+s.toUpperCase());
		System.out.println("uppercase: "+s.toLowerCase());
		char c = s.charAt(0);//Don't give any value more than the element of train
		System.out.println(c);
		String sub = s.substring(2);
		System.out.println(sub);
		sub = s.substring(1, 3);
		System.out.println(sub);
		System.out.println(s);
		boolean b = s.contentEquals("train");
		System.out.println(b);
		b = s.equalsIgnoreCase("train");
		System.out.println(b);
		String rev = reverse("moon");
		System.out.println("rev: "+rev);
		
	}
	static String reverse(String s) {
		char[] a = s.toCharArray();
		char [] reverse = new char [a.length];
		for(int end=a.length-1, start=0 ; start<a.length ; start++, end--) {
			reverse[start] = a[end];
		}
		return new String(reverse);
	}
	
	

}
