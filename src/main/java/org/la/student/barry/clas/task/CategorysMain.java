package org.la.student.barry.clas.task;

public class CategorysMain {

	public static void main(String[] args) {
		
		Categorys categorys= new Categorys();
		categorys.setId(12);
		categorys.setCategoryName("kit sport");
		categorys.setThumbNails("good");
		
		int id= categorys.getId();
		String categoryName= categorys.getCategoryName();
		String thumbNails=categorys.getThumbNails();
		
		System.out.println("Id: "+id);
		System.out.println("CategoryName: "+ categoryName);
		System.out.println("ThumbNails:"+thumbNails);
		
	}

}
