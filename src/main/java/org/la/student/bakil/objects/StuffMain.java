package org.la.student.bakil.objects;

public class StuffMain {

	public static void main(String[] args) {

		
		Stuff stuff = new Stuff();
		
		stuff.setId(768929);
		stuff.setStuffName("cotton");
		stuff.setThumbnail("^-^^-^");
		
		int id = stuff.getId();
		String stuffName = stuff.getStuffName();
		String thumbnail = stuff.getThumbnail();
	
		System.out.println("Id :"+id);
		System.out.println("Stuff name "+stuffName);
		System.out.println("Thumbnail :"+thumbnail);

	}

}
