package org.la.student.sajid;

public class WhileLoop34 {
	public static void main(String[] args) {
//		34. wap to print all upper case alphabets except vowels.
		
		int a=65;
		char b=(char)a;
		while(b>=65 && b<=90) {
		if('A'==b) {
			System.out.print("*");
		}else if('E'==b){
			System.out.print("*");
		}else if('I'==b) {
			System.out.print("*");
		}else if('O'==b) {
			System.out.print("*");
		}else if('U'==b) {
			System.out.print("*");
		}else {
			System.out.print(b);
		}
	b++;}
//		Alternative
		char d='A';
		while(d<='Z'){
		   if(!(d=='A' || d=='E'  || d=='I' || d=='O'  || d=='U')){
		     System.out.println(d);
		}
		d++;
		}
		
		
	}

}
