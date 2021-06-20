package org.la.student.noor;

public class BrandsMain {

	public static void main(String[] args) {
		Brands brands= new Brands();
		brands.setId(12);
		brands.setBrandName("Nike");
		brands.setThumbNails("good");

		int id= brands.getId();
		String brandName= brands.getBrandName();
		String thumbNails= brands.getThumbNails();
		
		//brands.display

		System.out.println("Id : "+brands.getId());
		System.out.println(" BrandName: "+brands.getBrandName());
		System.out.println("ThumbNials: "+brands.getThumbNails());



	}


	}
