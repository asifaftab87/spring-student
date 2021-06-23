package org.la.student.bakil.objects;

public class VariantValueMain {

	public static void main(String[] args) {

		
		VariantValue vr = new VariantValue();
		
		vr.setProductId(9983773);
		vr.setOptionId(776663);
		vr.setValueId(332333);
		vr.setDimensionId(655533);
		vr.setPrice("$22");
		vr.setSku("****");
		
		int productId= vr.getProductId();
		int optionId = vr.getOptionId();
		int valueId = vr.getValueId();
		int dimensionId = vr.getDimensionId();
		String price = vr.getPrice();
		String sku = vr.getSku();
		
		System.out.println("Product id :"+productId);
		System.out.println("Option id :"+optionId);
		System.out.println("Value id :"+valueId);
		System.out.println("Dimmension id :"+dimensionId);
		System.out.println("Price :"+price);
		System.out.println("Sku :"+sku);
	}

}
