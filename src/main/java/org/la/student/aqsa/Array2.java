package org.la.student.aqsa;
import java.util.Scanner;
public class Array2 {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 greatest(sc.nextInt(),sc.nextInt(),sc.nextInt());
 sc.close();
}
static void greatest(int a,int b,int c) {
	if(a>b&&a>c) {
		System.out.println(a+" is Greatest of three nos");
	}
	else if(b>c) {
		System.out.println(b+" is Greatest of three nos");
	}
	else {
		System.out.println(c+" is Greatest of three nos");
		System.out.println("Yes It is");		
	}
}
}
