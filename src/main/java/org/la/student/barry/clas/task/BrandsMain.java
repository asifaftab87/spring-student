package org.la.student.barry.clas.task;

public class BrandsMain {

	public static void main(String[] args) {
		Brands brands= new Brands();
		brands.setId(12);
		brands.setBrandName("Nike");
		brands.setThumbNails("great");
		
		int id= brands.getId();
		String brandName= brands.getBrandName();
		String thumbNails= brands.getThumbNails();
		
		System.out.println("Id : "+ id);
		System.out.println(" BrandName: "+ brandName);
		System.out.println("ThumbNials: "+thumbNails);
		
		

	}

}
