package org.la.student.bakil.overloading_and_constructor;

public class School {

	
		
		private int id;
		private String name;
		private String certificate;
	

        public School (){

        id=2232;
        name ="Bakil";
        certificate ="Degree";
        
        
        		
        }


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getCertificate() {
			return certificate;
		}


		public void setCertificate(String certificate) {
			this.certificate = certificate;
		}
		
		public void display() {
			System.out.println("Id :"+id +"Name :"+name +"Certificate :"+certificate);
		}
}