package org.la.student.tahir.clas;

public class ForEachCls {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,6,4,5};
		
		for(int i=0; i<a.length;i++) {
			if(i==0)
				System.out.println("For loop");
			System.out.println(a[i]);
		}
		
		System.out.println("Foreach loop");
		
		for(int x:a) {
			
		
			
			System.out.println(x);
		}

	}

}
