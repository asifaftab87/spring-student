package org.la.student.tania;

public class Boolean_operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        boolean a=true;
        boolean b=true;
        boolean c=true;
        boolean d=false;
        boolean e= a ||!b ||c||!d;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        
        boolean lampx=false,result;
        boolean  lampy=true;
        result=lampy&&lampx;
        System.out.println("lamp_switch_on" + result);
        result = lampy & lampx;
        System.out.println("lamp_switch_on" +result);
        
        boolean lampm=false, add;
        boolean  lampn=true;
        add=lampm||lampn;
        System.out.println("lamp_switch_on" + add);
        result = lampm | lampn;
        System.out.println("lamp_switch_on" +add);
        
        
        boolean lampk=false, output;
        boolean  lampl=false;
        output=lampk||lampl;
        System.out.println("lamp_switch_on" + output);
        output = lampk && lampl;
        System.out.println("lamp_switch_on" +output);
        
        
        
        
        
        
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

}
}