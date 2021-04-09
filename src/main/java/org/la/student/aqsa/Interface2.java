package org.la.student.aqsa;

public interface Interface2 {
	
	void display();
		
		class InntOut{
		
			void show() {
				
				System.out.println("Inner Class");
				
      		}
		
	}

	class MainImplmnt1 extends InntOut implements Interface2{
		
		public static void main(String[] args) {
			
			InntOut obj = new  MainImplmnt1();
			obj.show();
			Interface2 ob= new  MainImplmnt1();
			ob.display();
		
		}
		
		public void display() {
			System.out.println("Outer Interface");
			
		}

	}

	
	
}
