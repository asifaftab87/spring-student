package org.la.student.asif.hacker.rank;

import java.util.Arrays;

import org.slf4j.Logger;

public class Arrangement {

	
	int combinNum = 0;
	
	public static void main(String[] args) {
		
		Arrangement arrange = new Arrangement();
		
		int res = arrange.arrangements(4);
		
		System.out.println("combinNum: "+arrange.combinNum);
	}
	
	public int arrangements(int n) {
		
		int[] arr = getArray(n);
		//print(Arrays.copyOf(arr, arr.length));
		for(int i=0 ; i<arr.length ; i++) {
			combination(arr, i, arr.length);
			
		}
		
		int arrange = -1;
		
		
		return arrange;
	}
	

	
	public void combination(int[] arr, int si, int ei) {
		
		for(int x=si ; x<ei ; x++) {
			System.out.println("------");
			for(int y=x+1 ; y<ei ; y++) {
				int[] dup = Arrays.copyOf(arr, arr.length);
				int t = dup[x];
				dup[x] = dup[y];
				dup[y] = t;
				print(dup);
			}
			//print(dup);
		}
	}
	
	public void print(int[] a) {
		for(int i : a) {
			System.out.print(i+", ");
		}
		combinNum++;
		System.out.println("");
	}
	
	public long factorial(int n) {
		long f=1;
		while(n>1) {
			f = f * n;
			n = n -1;
		}
		return f;
	}
	
	public int[] getArray(int size) {
		
		int[] arr = new int[size];
		
		for(int i=0; i<size ; i++) {
			arr[i] = i+1;
		}
		return arr;
	}
	
}
