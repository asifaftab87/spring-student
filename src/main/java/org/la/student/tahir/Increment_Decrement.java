package org.la.student.tahir;

public class Increment_Decrement {

	public static void main(String[] args) {
		int a=34;
		double d= 20.5;
		d+=a;
		a+=d;
		d-=a;
		a-=d;
		System.out.println("d= " + ++d);
		System.out.println("a= " + a--);
		
		int b=4;
		b++;
		b +=b;
		--b;
		b= 7+b;
		b *= b;
		b -= 3;
		System.out.println("b = " + b);
		
		int c =4;
		c -= 10;
		c= -c;
		c = 7+c;
		System.out.println("c = " + c);
		c %=c;
		c = c*c-3;
		System.out.println("c = " + c);
		
		int f = -4;
		 f= f+1;
		 f++;
		 f+=1;
		 ++f;
		 System.out.println("f = " + f);
		 
		 short s= 10;
		 int e = s;
		 s+=10;
		 System.out.println(s + "," + e);
		 
		 short h= 10;
		 int g = h;
		 h= (short) (h + 10);
		 System.out.println(h + "," + g);
		 
		 //Q.27
		 int l = 0152;
		 l *= --l/ 2*2;
		 System.out.println("i= " + l);
		 
		 int x =10;
		 int y= -2;
		 int z= ++x * y++;
		 System.out.println("x = " +x);
		 System.out.println("y = " +y);
		 System.out.println("z = " +z);
		 
		 int i =3;
		 int j= 2;
		 int k= i++ * j++;
		 System.out.println("i = " +i);
		 System.out.println("j = " +j);
		 System.out.println("k = " +k);
		 
		 int m =-1;
		 int n= 2;
		 int o= --m * n++;
		 System.out.println("m = " +m);
		 System.out.println("n = " +n);
		 System.out.println("o = " +o);
		 
		 int p =0;
		 int q= -2;
		 int r= ++p * ++q;
		 System.out.println("p = " +p);
		 System.out.println("q = " +q);
		 System.out.println("r = " +r);

	}

}
