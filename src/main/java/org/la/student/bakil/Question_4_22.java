package assignment3;

/*
 * int a = 34;
        double d = 20.5;
        d+=a;
        a+=d;
        d-=a;
        a-=d;
        System.out.println(" d = " + ++d );
        System.out.println(" a = " + a-- );
 */
public class Question_4_22 {

	public static void main(String[] args) {
		int a = 34;
        double d = 20.5;
        d+=a; //54.5
        a+=d; //88
        d-=a; // -33.5
        a-=d; // 122
        System.out.println(" d = " + ++d );
        System.out.println(" a = " + a-- );
	}

}
