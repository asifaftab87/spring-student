package org.la.student.barry.collectn.task;

import java.util.ArrayList;
import java.util.List;

public class ConvertIntergerArrToInList {
	  // program to convert primitive integer array to list of Integer
    public static void main(String[] args)
    {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 , 8 };
 
        List<Integer> list = new ArrayList<>(arr.length);
 
        for (int i: arr) {
            list.add(Integer.valueOf(i));
        }
 
        System.out.println(list);
    }
	

}
