import java.awt.datatransfer.SystemFlavorMap;

public class Assignment2 {

	public static void main(String[] args) {
		
		//1-wap to create and print a char variable?
		char w='R';
		System.out.println("The char created is: "+ w +'\n');
		
		//2-wap to create and print a float variable?
		float f=7688f;
		System.out.println("The float value of F = "+f +'\n');
		
		//3-wap to create and print a short variable?
		short b=20998;
		System.out.println("The short value of B = "+ b +'\n');
		
		//4-wap to create and print a boolean variable?
		boolean value1=4>5;
		boolean value2=6>5;
		System.out.println("Is 4 > 5 ? the answer is :" + value1 );
		System.out.println("Is 6 > 5 ? the answer is :"+ value2 +'\n');
		
		//5-wap to create and print a double variable?
		double s=2330;
		System.out.println("The double value of S = "+s+'\n');
		
		//6-wap to create and print a long variable?
		long a=10002l;
		System.out.println("The long value of A = "+a +'\n');
		
		//7- What is the output of int i= 19/5
		int i = 19/5; 
        System.out.println(" 19 / 5 = "+i+'\n');
		
	
		//8- What is the output of char q = 65;
        char q = 65;
        System.out.println("The output of char q = 65;  is: "+q+'\n');

      //9- What is the output of int r = 'a';
        int r = 'a';
        System.out.println("The output of R = "+ r +'\n');

        //10- wap to add three numbers?
        int z=9,v=8,n=7;
        int m=z+v+n;
        System.out.println("9 + 8 + 7 = "+ m +'\n');

        //11- wap to subtract two numbers?
        int Z=9,N=7;
        int M=Z-N;
        System.out.println("9 - 7 =  "+ M +'\n');

        //12- wap to subtract three numbers?
        int as=12,ad=8,af=6;
        int sub=as-af-ad;
        System.out.println("12 - 6 - 8 = "+ sub +'\n');

        //13-wap to multiply two numbers?
        int qa=12,aw=9;
        int mult=qa*aw;
        System.out.println("12 * 9 = "+ mult +'\n');

        //14- wap to multiply three numbers?
        int er=3,rt=9,ty=2;
        int mult1=er*rt*ty;
        System.out.println("3 * 9 * 2 = "+ mult1 +'\n');
        
        //15- wap to find remainder of a given numbers?
        int ui=10%3;
        System.out.println("The remainder of 10 % 3 = "+ ui +'\n');

        //16- wap to find percentage?
        double pr=(double)(85*20)/100;
        System.out.println("The percentage of (85*20)/100 = "+ pr +'\n');

        //17- wap to find average of 3 numbers?
        int gf=5,hg=12,jh=6;
        double sum=gf+hg+jh;
        double avg=sum/3;
        System.out.println("The average of (5 + 12 + 6) / 3 = "+ avg +'\n');
        
      //18- wap to find average of 3 numbers?
        int zc=5,vc=22,bv=6,nv=9;
        double sum1=zc+vc+bv+nv;
        double avg1=sum1/4;
        System.out.println("The average of (5 + 22 + 6 + 9) / 4 = "+ avg1 +'\n');
        
      //19- wap to find average of 2 numbers?
        int l=13,p=22;
        double sum2=l+p;
        double avg2=sum2/2;
        System.out.println("The average of (13 + 22) / 2 = "+ avg2 +'\n');

        //20- what will be output: int x = 5 + 3 * 4 / 5 + 4;
        int y=5,e=4,o=3,g=5;
        double x1= y+Double.valueOf(o*e)/(g)+e;
        System.out.println("5 + (3 * 4) / (5) + 4 = "+ x1 +'\n');

        //21- what will be output: double x = 14 / 5 ;
        int iu=14,iy=5;
        double ix=Double.valueOf(iu)/iy;
        System.out.println("The output of (14 / 5) = "+ ix +'\n');

        
        //22- What will be the output of the following codes ?
        int ox = 15;
        int oy = ox % 4;
        int oz = oy * 24;
        System.out.println("(15 % 4) = " + oy);
        System.out.println("(3 * 24) = " + oz);
        System.out.println("The output of (72 / 2) = "+ oz / 2 +'\n');
        
        //23- What will be the output of the following code ?
        double is = 34.0,js = 7;
        double ks = is % js;
        System.out.println("The output of (34.0 % 7) = " + ks +'\n' );
	
        //24- What will be the output of the following code ?
        double ax = 42;
        double ay = 42.25;
		System.out.println("(42 % 10)  = " + ax % 10 );
        System.out.println("(42.25 % 10) = " + ay % 10 +'\n');
        
        int aq = 31, bq = 40;
        int cq = bq - aq;
        bq = cq % aq;        
        bq = bq / aq;        
        aq = ++cq;  	      
        bq = (aq - --bq) * cq;
        System.out.println("The output of (0 - -10) * 10 = "+ bq +'\n');

        //25- What will be the output of the following code ?
        int num = 69;
        int days = num % 30; //reminder 9
        int month = num / 30; 
        System.out.println(month + " Month and " + days + " days" +'\n');
        
        //26- What will be the output of the following code ?
        int ap = 56;
        int bp = -8;
        int cp = ap % bp; // 56 % -8 = 0
        int dp = bp % ap; // -8 % 56 = -8
        System.out.println("56 % -8 = "+ cp + " , " + "-8 % 56 = " + dp +'\n');
        
        //27- What will be the output of the following code ?
        int ll=10,kl=5,lx=100,mm=25,xm=11,jj=7;
		int zx =(ll * kl) + (lx * mm * xm); // 50 + 27500 = 27550
		int yz = ((mm * ll* ll) - (kl + jj) % 2); // 2500 - 0 = 2500
		System.out.println("50 + 11 - 0 = "+((ll*kl) + (lx*mm*xm)/(mm*ll*ll)-(kl+jj)%2)); // 50 + 27550 / 2500 - 12 % 2 = 50 + 11.02 - 0 = 
		System.out.print("27550 / 2500 = "+ zx / yz);


	
	}
	
}