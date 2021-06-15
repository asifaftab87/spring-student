package org.la.student.kayes.method;

public class NegativeWithoutIf {
	static int negativeNum(int a, int b) 

    {

		return a * (a > 0 ? 0 : 1) + b * (b > 0 ? 0 : 1);

    }

    public static void main(String[] args) 

    {

        int a = -1231, b = 1231;

        System.out.print(negativeNum(a, b));

    }

}
