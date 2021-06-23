package org.la.student.bakil.objects;

public class ColorsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Colors color = new Colors();
		
		color.setID(92223);
		color.setColorName("Black");
		
		int id = color.getId();
		String colorName= color.getColorName();
		
		System.out.println("Id :"+id );
		System.out.println("Color name :"+colorName);
	}

}
