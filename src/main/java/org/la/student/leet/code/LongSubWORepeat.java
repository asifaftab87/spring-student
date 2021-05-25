package org.la.student.leet.code;

/*
 * Longest Substring Without Repeating Characters
 */

public class LongSubWORepeat {

	public static void main(String[] args) {

		String sb = "asdikjklmnopqrstuvjaaeghfdcb";
		int longest = solution(sb);
		System.out.println("longest string: "+longest);
	}

	
	static int solution(String src) {
		
		int len = src.length();
		int max = -1;
		for(int i=0 ; i<len ; i++) {
			int j = i + 1;
			String tmp = null;
			
			while(j<len) {
				tmp = src.substring(i, j);
				int indexOf = tmp.indexOf(src.charAt(j));
				if(max<tmp.length()) {
					max = tmp.length();
				}
				if(indexOf!=-1) {
					break;
				}
				j++;
			}
			if(j==len) {
				tmp = src.substring(i, j-1);
				int indexOf = tmp.indexOf(src.charAt(j-1));
				
				if(indexOf==-1) {
					if(max<tmp.length()+1)
						max = tmp.length()+1;
				}
				break;
			}
			
		}
		return max;
	}
}
