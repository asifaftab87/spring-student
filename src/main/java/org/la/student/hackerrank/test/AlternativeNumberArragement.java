package org.la.student.hackerrank.test;

/*
 *  there is a company  
 */
public class AlternativeNumberArragement {

	public static void main(String[] args) {
		
		System.out.println("123456 result : "+solution(123456));
		System.out.println("130 result: "+solution(130));
		System.out.println("1 result: "+solution(1));
		System.out.println("0 result: "+solution(0));
		System.out.println("100000000 result: "+solution(100000000));
	}
	
	public static int solution(int A) {
		
		String number = String.valueOf(A);		//int to String
		
		int end = number.length() - 1;			//index of last element
		
		StringBuilder sb = new StringBuilder();	//can manipulate string and efficient as not synchronize
		int start = 0;
		
		for( ; start<end ; start++, end--) {	//loop will stop when last index and start index value same
			sb.append(number.charAt(start));	//adding first index of number
			sb.append(number.charAt(end));		//alternatively adding last index of number
		}

		if(number.length()%2!=0) {					//for string of odd number adding last element
			sb.append(number.charAt(start));		//as previous case we missed last element for odd number of digits
		}
		return Integer.valueOf(sb.toString());
	}
}
