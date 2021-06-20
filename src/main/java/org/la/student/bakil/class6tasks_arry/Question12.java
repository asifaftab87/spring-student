package org.la.student.bakil.class6tasks_arry;
/*
 * wap to copy one array into other array in reverse order
 */
public class Question12 {

	public static void main(String[] args) {
	
		int a [] = {22,1,5,31,44,-22};
		int[] x =  new int [a.length];
	
		
		for(int i=0 ; i<x.length;i++) {
			
				x[i] = a[a.length-1-i];
		}
	
	for (int y:x) {
		System.out.print(y+"  ");

			}
	}
	        }
	
		

