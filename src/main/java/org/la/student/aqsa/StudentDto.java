package org.la.student.aqsa;
public class StudentDto {

	private int rollNo,standard,id  ;
	private String name,email,fatherName,place,nationality;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getrollNo() {
		return rollNo;
	}
	public void setrollNo(int rollNo) {
		this.rollNo=rollNo;
	}
	
	public int getstandard() {
		return standard;
	}
	public void setstandard(int standard) {
		this.standard=standard;
	}
	
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id=id;
	}
	
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email=email;
	}
	
	public String getfatherName() {
		return fatherName;
	}
	public void setfatherName(String fatherName) {
		this.fatherName=fatherName;
	}
	
	public String getplace() {
		return place;
	}
	public void setplace(String place) {
		this.place=place;
	}
	
	public String getnationality() {
		return nationality;
	}
	public void setnationality(String nationality) {
		this.nationality=nationality;
	}
	
	@Override
	public String toString() {
		return "  roll: "+rollNo+"  standard: "+standard+"  id "+id+"  name: "+name+"  email: "+email+ "  fatherName: "+fatherName+"  place: "+place+"  nationality ; "+nationality;
	}
}
