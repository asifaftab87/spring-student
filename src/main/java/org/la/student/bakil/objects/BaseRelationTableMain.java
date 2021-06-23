package org.la.student.bakil.objects;

public class BaseRelationTableMain {

	public static void main(String[] args) {

		
		BaseRelationTable base = new BaseRelationTable();
		
		base.setId(3454534);
		base.setBrandsId(8876637);
		base.setCategoryId(557892);
		base.setCollectionId(77627289);
		
		int id =base.getId();
		int brandId = base.getBrandsId();
		int categoryId =base.getCategoryId();
		int collectionId = base.getCollectionId();
		
		System.out.println("Id :"+id);
		System.out.println("Brands id :"+brandId);
		System.out.println("Category id :"+categoryId);
		System.out.println("Collection id :"+collectionId);
	}

}
