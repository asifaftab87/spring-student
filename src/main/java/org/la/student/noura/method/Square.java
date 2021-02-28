package org.la.student.noura.method;

import org.la.student.noura.inherit.Look;



	public class Square extends Look {

		
		public Square() {
			System.out.println("default Square constructor child");
		}
		
		
		
		
		public Square(int id) {
			super(id);
			System.out.println("default Square constructor child id: "+id);
			super.thing();
		}
		
		
		@Override 
		public void thing() {
				
				System.out.println("this is Square.thing method child");
			}

		}

