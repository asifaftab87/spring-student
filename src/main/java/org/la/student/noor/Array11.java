package org.la.student.noor;
//wap to copy one array into other array
public class Array11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[]= {1,3,5};
       int b[]=new int[a.length];
       for(int i=0;i<a.length;i++) {
    	   b[i]=a[i];
    	   System.out.println(b[i]);
       }
	}

}
