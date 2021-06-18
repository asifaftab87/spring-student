package org.la.student.noor;

public class CategorysMain {

	public static void main(String[] args) {
		Categorys categorys= new Categorys();
		categorys.setId(1);
		categorys.setCategoryName("dresses");
		categorys.setThumbNails("good");

		int id= categorys.getId();
		String categoryName= categorys.getCategoryName();
		String thumbNails=categorys.getThumbNails();

		System.out.println("Id: "+categorys.getId());
		System.out.println("CategoryName: "+categorys.getCategoryName());
		System.out.println("ThumbNails:"+categorys.getThumbNails());

	}

	}
