package org.la.student.tahir.array;

public class indexofarrayifpresent {

	public static void main(String[] args) {
		// wap to  check element and its index

		int arr[]= {1,1,2,0,4,3,0,6,0};
		
		int len=arr.length;
		int zero = 1;
		int i=0;
		int count =0;
		
		for(;i<len;i++) {
			
			
			if(arr[i]== zero) {
				System.out.println("Element\t" + "Index");
				System.out.print(arr[i] + " ");
				System.out.println("     \t" +i);
				
				count= count +	1;
			}
			
		
			}
		if(count ==0)
		{System.out.println("-1");
		
		}
		
	
		}
		
		
		
	}


