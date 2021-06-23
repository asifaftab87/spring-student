package org.la.student.bakil.objects;

public class ProductVariantMain {

	public static void main(String[] args) {
		 
		ProductVariant variant = new ProductVariant();
	
		variant.setVariantId(2321312);
		variant.setProductId(98261);
		variant.setFnishId(33223);
		variant.setColorsId(22311);
		variant.setMetaData("HRTS A");
		variant.setThumbnails("****");
	
	
		int variantId= variant.getVariantId();
		int productId =variant.getProductId();
		int finishId =variant.getFinishId();
		int colorsId = variant.getColorsId();
		String metaData = variant.getMetaData();
		String thumbnails = variant.getThumbnils();
		
		System.out.println("Variant id :"+variantId);
		System.out.println("Product id :"+productId);
		System.out.println("Finish id :"+finishId);
		System.out.println("Colors id :"+colorsId);
		System.out.println("Meta data :"+metaData);
		System.out.println("Thumb nails :"+thumbnails);
	
	
	}
	}


