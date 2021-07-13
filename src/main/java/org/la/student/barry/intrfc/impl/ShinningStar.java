package org.la.student.barry.intrfc.impl;

import org.la.student.barry.intrfc.Star;

public class ShinningStar {
	
	public static void main(String[] args) {
		
		Star star= new Star(){
		   @Override
		public void size() {
			System.out.println("This is shinning star");
		}
		
	};
     star.size();
	}
}
