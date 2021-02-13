package org.la.student.cod.signl.test;

public class BestSquare {

	public static void main(String[] args) {
		
		int[][] m = {{1,2},{3,4},{5,6}};
		//System.out.println("row: "+m.length);
		//System.out.println("row: "+m[0].length);
		bestSquare(m, 2);
	}
	
	static int bestSquare(int[][] m, int k) {
		int result = 0;
		
		int countRow = 0;
		int countCol = 0;
		int sum = 0;
		
		for(int r=0 ; r<m.length ; r++) {
			
			countRow++;
			
			for(int c=0 ; c<m[r].length ; c++) {
				countCol++;
				if(k==countCol){
					countCol = 0;
					break;
				}
				sum = sum + m[r][c];
			}
			if(k==countRow) {
				System.out.println("sum: "+sum);
				countRow = 0;
				sum = 0;
				
			}
			
		}
		
		return result;
	}
}
