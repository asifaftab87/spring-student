package org.la.student.sadique;

public class CheekNumberIsPalindromOrNot {

		public static void main(String[] args) {
//			Wap to check whether a number is palindrome or not.
			int num=181,same=num,r,s=0;
			while(num!=0) {
				r=num%10;
				s=s*10+r;
				num=num/10;
			}if(same==s) {
				System.out.println("is a palindrome:"+s);
			}else
				System.out.println("in not a palindrome :"+s);
		}

	}
