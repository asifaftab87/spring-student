package org.la.student.jamal.loob;

public class ForLoob54 {
	
	//54.	Wap to print multiplication table of any number.
	
	public static void main(String[] args) {
		

		int num=4;
		for (int i=1;i<=10;i++) {
			System.out.println(i+"*"+num +"=" + i*num);
		}
		
		int j=1;
		int m=4;
		
		while(j<=10) {
			int ans =j*m;
			System.out.println("this is while : "+m+"*"+j+"="+ans);
			j++;
		}
		
	}

}
