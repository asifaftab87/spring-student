package org.la.student.noura;

public class DifferentExcercises2 {

	public static void main(String[] args) {
		short q =10;
		int d =q;
		q+=10;
		System.out.println(q+","+d);
	
		
		
		short m =10;
		int w=m;
		m=(short) (m+10);
		System.out.println(m+","+w);

		
		
		
        int k =0152;
        k*= --k/2*2;
		System.out.println("k="+k);
		
		
		int zx= (10*5+100*(25*11));
		int yz=((25*10)*10-5+7%2);
		System.out.println(zx/yz);
		
		
		int a =34;
		double c =20.5;
		c+=a;
		a+=c;
		c-=a;
		a-=c;
		System.out.println("c="+ ++c);
		System.out.println("a="+ a--);
		
		int u=4;
		u++;
		u+=u;
		u--;
		u=7+u;
		u*=u;
		u-=3;
		System.out.println("u="+u);
		

		
		System.out.println("result is="+ (10*5+100*(25*11)/(25*10)*10-5+7%2));
		

	}

}
