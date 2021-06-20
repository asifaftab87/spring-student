package org.la.student.barry.clas.task;

public class ProductVariantMain {

	public static void main(String[] args) {
		
		ProductVariant productVariant= new ProductVariant();
		productVariant.setVariantId(12);
		productVariant.setColorsId(20);
		productVariant.setProdcutId(1505);
		productVariant.setFinishId(4);
		productVariant.setMegadata(450);
		productVariant.setThumbNails("Super");
		
		int variantId= productVariant.getVariantId();
		int colorsId= productVariant.getColorsId();
		int productId= productVariant.getProductId();
		int finishId= productVariant.getFinishId();
		int megadata= productVariant.getMegadata();
		String thumbNails= productVariant.getThumbNails();

		System.out.println("VariantId: "+variantId);
		System.out.println("ColorsId: "+colorsId);
		System.out.println("ProductId: "+productId);
		System.out.println("FinishId: "+finishId);
		System.out.println("Megadata: "+megadata);
		System.out.println("ThumbNails: "+thumbNails);
	}

}
