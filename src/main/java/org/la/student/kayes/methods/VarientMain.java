package org.la.student.kayes.methods;

public class VarientMain {
	public static void name() 
	{
		VarientValue varient=new VarientValue();
		varient.setPro(15);
		varient.setOpt(45);
		varient.setVal(555);
		varient.setDim(1);
		varient.setVar(78);
		varient.setPri(50000);
		
		int pro=varient.getPro();
		int opt=varient.getOpt();
		int val=varient.getVal();
		int dim=varient.getDim();
		int var=varient.getVar();
		int pri=varient.getPri();
		
		System.out.println("product id=  "+pro);
		System.out.println("option id=  "+opt);
		System.out.println("value id=  "+val);
		System.out.println("dimension id=  "+dim);
		System.out.println("varient id=  "+var);
		System.out.println("price=  "+pri);
	}

}
