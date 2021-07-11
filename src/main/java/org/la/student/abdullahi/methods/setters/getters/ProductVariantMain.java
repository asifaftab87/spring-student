package org.la.student.abdullahi.methods.setters.getters;

public class ProductVariantMain {

	public static void main(String[]args) {
		
		ProductVariant p = new ProductVariant();
		p.setVariantId("V1015");
		p.setProductId("p15");
		p.setFinishId("F895");
		p.setColorsId("C1435");
		p.setMetadataId("M332");
		p.setThumbnail("TH0090");
		
		String VariantId = p.getVariantId();
		String ProductId = p.getProductId();
		String FinishId = p.getFinishId();
		String ColorsId = p.getColorsId();
		String MetadataId = p.getMetadataId();
		String Thumbnail = p.getThumbnail();
		
		System.out.println("Variant Id = "+VariantId);
		System.out.println("Product Id = "+ProductId);
		System.out.println("Finish Id = "+FinishId);
		System.out.println("Colors Id = "+ColorsId);
		System.out.println("Metadata Id = "+MetadataId);
		System.out.println("Thumbnail = "+Thumbnail);
		
	}
}