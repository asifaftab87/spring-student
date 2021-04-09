package org.la.student.aqsa;

public abstract class Abstract6 {
	abstract double getPercentage();

}
class A6 extends Abstract6{
	double sub1;
	double sub2;
	double sub3;
	
	A6(double sub1,double sub2,double sub3){
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
		
	}
	
	@Override
	double getPercentage() {
		double percent = (sub1+sub2+sub3)/3;
		return percent;
	}
	
}

class B6 extends Abstract6{
	double sub1;
	double sub2;
	double sub3;
	double sub4;
	
	B6(double sub1,double sub2,double sub3,double sub4){
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
		this.sub4=sub4;
	}
	
	@Override
	double  getPercentage() {
		double percent= (sub1+sub2+sub3+sub4)/4;
		return percent ;
	}
	
}

class Demo6{
	public static void main(String[] args) {
		
		A6 a = new A6(40,67,86);
		B6 b = new B6(65,98,34,78);
		
		System.out.println(a.getPercentage());
		System.out.println(b.getPercentage());
	}
}
