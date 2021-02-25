package org.la.student.sadique.clas;

public class CheekTwoArrayEqualOrNot {
	public static void main(String[] args) {
		int bade[]=new int[] {2,5,7};
		int chote[]=new int[] {2,5,7};
		boolean isEqual = true;
		
		if(bade.length==chote.length ) {
			for(int i=0;i<bade.length;i++) {
				if(bade[i]!=chote[i]) {
					isEqual=false;
				}
			}
		}else {
			isEqual=false;
		}
		if(isEqual ) {
			System.out.println("Both array are equal");
		} else {
			System.out.println("Both array are not equal");
		}
	}

}
