package org.la.student.aqsa;

import java.util.*;
public class StudentCollection {
	private String name;
	private int id;
	private int classs;
	private int roll;

	StudentCollection(String name,int id,int classs, int roll){
	this.name=name;
	this.id=id;
	this.classs=classs;
	this.roll=roll;
	
	}

	public static void main(String[] args) {
		
		
		LinkedList<StudentCollection> l1 = new LinkedList();  
	
		
		StudentCollection s1 = new StudentCollection("Rahul",4567,8,41);
		StudentCollection s2 = new StudentCollection("Abhis",4568,8,42);
		StudentCollection s3 = new StudentCollection("Amit",4569,8,43);
		StudentCollection s4 = new StudentCollection("Aman",4570,8,44);
		StudentCollection s5 = new StudentCollection("kemin",4571,8,45);
		StudentCollection s6 = new StudentCollection("leris",4572,8,46);
		StudentCollection s7 = new StudentCollection("serum",4573,8,47);
		
		l1.add(s1);
		l1.add(s2);
		l1.add(s3);
		l1.add(s4);
		l1.add(s5);
		l1.add(s6);
		l1.add(s7);
		
		for(int i=0;i<7;i++) {
		System.out.println(l1.get(i).name+" "+l1.get(i).id+"  "+l1.get(i).classs+"  "+l1.get(i).roll);
		
		//System.out.println(l2.toString());
		}
		
	}
}