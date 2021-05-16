package org.la.student.noor;
// wap to check whether two array are equal or not(means we have to check each element of two arrays)?
import java.util.Arrays;

public class Array20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[]= {30,20,40};
       int b[]= {30,20,40};
       
       boolean result=Arrays.equals(a,b);
       if(result==true) {
    	   System.out.println("arrays are equal");
       }
    	   else
    		   System.out.println("arrays are not equal");
    	   }
       }
