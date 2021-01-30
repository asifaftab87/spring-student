package org.la.student.aameen.method;

public class AllMethod {

	public static void main(String[] args) {
		
		System.out.println("  Main Method ");
		
		System.out.println("    ");
		noaccept();
		
		System.out.println("   ");
		
		method1(44);
		
		System.out.println(" ");
		
		char ss = method2();
		System.out.println(" ");
		
		System.out.println("The character use in method2 is  : " +ss );
		
		System.out.println("  ");
		
		boolean t = method3(55);
		
		System.out.println("  ");
		
		System.out.println(" t is " +t);
	}
	public static void  noaccept()
	{
		System.out.println(" Not Accept nor return");
	}
	
	
	public static void method1(int a)
	{
		System.out.println(" the value of a : " +a + "  . Accept but not return");
	}
	
		public static char method2()
		{
			System.out.println(" Not accepting but returning");
			return 'a';
		}
		
		public static boolean method3(int a )
		{
			System.out.println(" the value of a : " +a + " .  accept and return ");
			return false;
		}
}
