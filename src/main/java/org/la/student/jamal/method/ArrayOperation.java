package org.la.student.jamal.method;

public class ArrayOperation {
	
 
	/*create a class name ArrayOperation
		void printNegative(int[])
		void printPositive(int[])
		void printEven(int[])
		void printOdd(int[])
		void printNum(int[], int)
		void copy(int[], int[])
		int[] copy(int[])
		int sum(int[])
		int average(int[])
		int greatest(int[])
		int smallest(int[])
		int[] addCopyArrays(int[], int[]) - all array of same size
		int[] copyArrays(int[], int[]) - target array size = size of arr1 + size of arr2
	 * 
	 */

	public static void main(String[] args) {
		int a[]= {-1,-2,3,4,-5,-6,8,9};
		System.out.println(" this is the negative numbers : " );
		printNegative(a);
		
		System.out.println("\n this is the positive numbers :  ");
		int b[]={-1,-2,3,4,-5,-6,8,9};
		printPositive(b);
		
		System.out.println("\n this is the even numbers :  ");
		int c []= {1,2,3,4,5,6,7,8,9,10};
		printEven(c);
		
		System.out.println("\n print number : ");
		
		int num []= {10,20,30,40,50,60,70};
		int num1 []= {100,200,300,400};
		printNum(num,num1);
		
		System.out.println("\n this is  copy : " );
		int cy []= {10,20,30,40,50};
		int cy1[]=cy;
		copy(cy,cy1);
		
		System.out.println(" \n this is the average : ");
		int s[]= {19, 12, 16, 200, 13};
		average(s);
		
		System.out.println("\n this is the greatest :");
		int array[] = {10, 20, 25, 2, 63, 96, 57};
		greatest(array);
		
		System.out.println("\n this is the smallest : ");
		int arr[]= {12,3,45,6,67,34};
		smallest (arr);
		
		System.out.println("\n this is the addCopyArrays : ");
		int x[]= {1,2,3,4,5,6};
		int y[]=x;
		addCopyArrays(x,y);
		
		
		

		
		
	}
	
	static void printNegative(int a[]) {
		
		for(int i=0;i<a.length;i++ ) {
			if (a[i]<0) {
				System.out.print( a[i] + " ");
			}
		}

	}
	static void printPositive(int b []) {
		for(int i=0;i<b.length;i++ ) {
			if (b[i]>0) {
				
				System.out.print( b[i] + " ");
			}
			
		}
	}
	
	static void printEven(int c []) {
		for (int i=0;i<c.length;i++) {
			if (c[i]%2==0) {
				System.out.print(c[i] + " ");
			}
		}
	}
	
	static void printNum(int num[],int num1 []) {
		for(int i=0;i<num.length;i++) {
			
			System.out.print(num[i]+" ");
			
			
		}
		System.out.println(" \n this is num1:  ");
		for(int i=0;i<num1.length;i++) {
			System.out.print(num1[i]+" ");
		}
		
	}
	static void  copy(int cy[], int cy1[]) {
		for ( int i=0;i<cy.length;i++) {
			System.out.print(cy1[i]+" ");
		}
	}
	
	static int average(int s []) {
		int total=0;
		for(int i=0;i<s.length;i++) {
			total=total+s[i];
			int  average =total/s.length;
			
			System.out.print( average+" ");
		}
		
		return total;
	}
	
	static int greatest(int array []) {
		int temp, size;
	     
	      size = array.length;

	      for(int i = 0; i<size; i++ ){
	         for(int j = i+1; j<size; j++){
	            if(array[i]>array[j]){
	               temp = array[i];
	               array[i] = array[j];
	               array[j] = temp;
	            }
	         }
	      }
	      System.out.println(array[size-1]);
		
	      return size;
	}
	
	static int  smallest(int arr[]) {
		int temp,size;
		
		
		size=arr.length;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if ( arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
 
		System.out.println(arr[0]);
		return size;
	
	
	}
	static int[] addCopyArrays(int x[] , int y[]) {
		for (int i=0;i<x.length;i++) {
			System.out.print(y[i]+ " ");
		}
		return x;
	}


	
	

}
