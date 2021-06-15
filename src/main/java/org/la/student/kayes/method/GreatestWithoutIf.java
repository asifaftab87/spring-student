package org.la.student.kayes.method;

public class GreatestWithoutIf {
	static int largestNum(int a, int b) 

    {

		return a * ((a / b) > 0 ? 1 : 0) + b * ((b / a) > 0 ? 1 : 0);

    }

    public static void main(String[] args) 

    {

        int a = 22222, b = 1231;

        System.out.print(largestNum(a, b));

    }
}

	