package org.la.student.tahir.interfce;

public class ImplementSeries implements Series  {
	
	
		public void fibonocci() {
			
			int a = 0, b=1, c;
			
			for(int i=1; i<=10; i++) {
				
			c= a + b;
			System.out.println(c);
			a = b;
			b= c;
			
			}
			
		
			
		}
		/*public void pell();
		public void square();
		public void cube();
		public void firstTenNaturalNum();
		public void firstTenEvenNum();
		public void firstTenOddNum();
		public void printNumBetween90N100();
		*/
	
	

}
