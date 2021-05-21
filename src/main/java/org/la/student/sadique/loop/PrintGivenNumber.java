package org.la.student.sadique.loop;
//wap to print all numbers from 1 to 10 except 3 and 7.

public class PrintGivenNumber {

	public static void main(String[] args) {
		int num;
		for(num=1;num<=10;num++) {
			if(num!=3 &&num!=7) {
				System.out.println(num);
			}
		}
		//	wap to print all numbers from 1 to 10 except 2 and 5 and 8
		
		System.out.println("******");
		for(num=1;num<=10;num++) {
			if(num!=2 && num!=5 && num!=8) {
				System.out.println(num);
			}
		}
	}

}
