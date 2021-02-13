package org.la.student.cod.signl.test;

public class AlmostString {

	public static void main(String[] args) {
		
		//int result = almostString("azcabcab", "acb");
		int result = almostString("", "acb");
		System.out.println("number found: "+result);
		
	}
	
	static int almostString(String src, String tar) {
		
		
		int found = 0;
		int len = src.length();
		
		for(int i=0 ; i<len ; i++) {
			StringBuilder sb  = new StringBuilder();
			sb.append(src.charAt(i));
			if(i+2<len) {
				sb.append(src.charAt(i+2));
				if(i+4<len) {
					sb.append(src.charAt(i+4));
				}
			}
			System.out.println("sb: "+sb);
			if(sb.toString().equalsIgnoreCase(tar)) {
				found++;
			}
		}
		
		
		return found;
	}
}
