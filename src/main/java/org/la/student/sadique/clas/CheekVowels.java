package org.la.student.sadique.clas;

public class CheekVowels {
static boolean emt(char i) {
	if ( i>=65&&i<=90 || i>=97&&i<=122) {
		System.out.println(i+" is vowel");
		return true;
	}else {
		return false;
	}
 } public static void main(String[] args) {
	boolean v=emt('@');
	System.out.println(v);
}
}

