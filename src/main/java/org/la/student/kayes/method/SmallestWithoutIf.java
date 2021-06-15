package org.la.student.kayes.method;

public class SmallestWithoutIf {
	static int smallestNum(int a, int b) 

    {

		return a * ((a / b) > 0 ? 0: 1) + b * ((b / a) > 0 ? 0: 1);

    }

    public static void main(String[] args) 

    {

        int a = 22222, b = 1231;

        System.out.print(smallestNum(a, b));

    }

}
