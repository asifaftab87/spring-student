package org.la.student.tahir.interfce;

public class ImplementSeries implements Series  {
	
	
		public void fibonocci() {
			
			int a = 0, b=1, c;
			System.out.println("Fibonocci Series");
			for(int i=1; i<=10; i++) {
				
			c= a + b;
			System.out.println(c);
			a = b;
			b= c;
			
			}
			
		
			
		}
		public void pell() {
			
			int a =1, b=0, c;
			
			System.out.println("Pell series");
			for(int i=1; i<= 20; i++) {
				
				c = a + 2*b;
				
				System.out.println(" "+ c);
				a = b;
				b = c;
			}
		}
		
		
		
	
		public void square() {
			
			System.out.println("Area of a Square");
			
			int L = 10, b= 20, Area;
			
			Area = b*L;
			
			System.out.println(Area);
			
		}
		
	
		public void cube() {
			
			System.out.println("Area of a cube");
			
			int L= 10, b= 20, H= 30, Area;
			
			Area = L*b*H;
			
			System.out.println(Area);
		}
		
		
		public void firstTenNaturalNum() {
			
			System.out.println("First 10 natural numbers");
			
			for (int i=1; i<=10 ; i++){
				
				System.out.println(i);
			}
			
			
		}
		
		
		public void firstTenEvenNum() {
			
			System.out.println("First 10 even numbers");
			
			for(int i =0; i< 20; i++) {
				
				if(i%2 == 0) {
					
					System.out.println(i);
				}
			}
		}
		
		
		public void firstTenOddNum() {
			
			System.out.println("First 10 odd numbers");
			
			for(int i= 0; i<= 20; i++) {
				
				if(i%2 != 0) {
					System.out.println(i);
				}
			}
		}
		
		
		public void printNumBetween90N100() {
			
			System.out.println("Numbers between 90 and 100");
			
			for( int i=90; i<= 100; i++) {
				
				System.out.println(i);
			}
		}
		
	
	

}
