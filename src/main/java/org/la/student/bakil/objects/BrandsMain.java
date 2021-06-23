package org.la.student.bakil.objects;

public class BrandsMain {

	public static void main(String[] args) {

		Brands brands = new Brands();
		
		brands.setId(2123);
		brands.setBrandName("H&M");
		brands.setThumbnails("&&&&");

		
		int id =brands.getId();
		String brandName =brands.getBrandName();
		String thumbnails =brands.getThumbnails();
		
		System.out.println("Id :"+id);
		System.out.println("Brand name :"+brandName);
		System.out.println("Thumbnails :"+thumbnails);
	
	
	}

}
