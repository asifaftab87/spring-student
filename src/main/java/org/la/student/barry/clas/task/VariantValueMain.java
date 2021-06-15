package org.la.student.barry.clas.task;

public class VariantValueMain {

	public static void main(String[] args) {
		VariantValue variantValue= new VariantValue();
		variantValue.setProductId(7);
		variantValue.setOptionId(6);
		variantValue.setValueId(4);
		variantValue.setDimensionId(78);
		variantValue.setvariantId(21);
		variantValue.setPrice(500);
		variantValue.setSku(111555664);
		
		int productId= variantValue.getProductId();
		int optionId= variantValue.getOptionId();
		int valueId= variantValue.getVariantId();
		int dimensionId= variantValue.getDimensionId();
		int variableId= variantValue.getValueId();
		int price= variantValue.getPrice();
		int sku= variantValue.getSku();
		
		System.out.println("ProductId: "+productId);
		System.out.println("OptionId: "+optionId);
		System.out.println("ValueId: "+valueId);
		System.out.println("DimensionId: "+dimensionId+"cm");
		System.out.println("VariableId: "+variableId);
		System.out.println("Price: "+price+"RM");
		System.out.println("Sku: "+sku+ " code");
	}

}
