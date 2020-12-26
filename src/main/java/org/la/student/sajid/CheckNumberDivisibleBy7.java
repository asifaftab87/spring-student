package org.la.student.sajid;

public class CheckNumberDivisibleBy7 {
public static void main(String[] args) {
//	wap to check whether number divisible by 7
	
	int n=14;
	
	
	if(n%7==0) {
		System.out.println(n+" is Divisible by 7 ");
	}else {
		System.out.println(n+" is not Divisible by 7 ");
	}
	
	
	while(n%7==0) {
		System.out.println(n+" is Divisible by 7 ");
		if(n%7!=0) {
			System.out.println(n+" is not Divisible by 7 ");
		}
		break;}
	
	
	for(;n%7==0;) {
		System.out.println(n+" is Divisible by 7 ");
	if(n%7!=0) {
		System.out.println(n+" is not Divisible by 7 ");
	}
	break;}
	
}

}
