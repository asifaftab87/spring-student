package org.la.student.kayes.method;

public class CharReverse {
	static String reverse(String str)
	{
		String s="";
		for(int i=str.length()-1;i>=0;i--)
		{
			s=s+str.charAt(i);
		}
		return s;
	}

	public static void main(String[] args) {
		String n="ROMAN";
		String k=reverse(n);
		System.out.println("Reverse String=   "+k);
		String k1=reverse(k);
		System.out.println("Reverse String=   "+k1);
	}

}
