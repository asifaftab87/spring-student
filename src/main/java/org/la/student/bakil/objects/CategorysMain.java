package org.la.student.bakil.objects;

public class CategorysMain {

	public static void main(String[] args) {


		Categorys category = new Categorys();
		
		category.setId(7826);
		category.setCategoryName("Cloths");
		category.setThumbnail("(@_^_@)");
		
		int id =category.getId();
		String categoryName=category.getCategoryName();
		String thumbnail =category.getThumbnail();
		
		System.out.println("Id :"+id);
		System.out.println("Category name :"+categoryName);
		System.out.println("Thumbnail :"+thumbnail);
	}

}
