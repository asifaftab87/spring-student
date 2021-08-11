package org.la.student.barry.collectn.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertIntergerArrToInList2 {
	
 // program to convert primitive integer array to list of Integer
	    public static void main(String[] args)
	    {
	        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8};
	 
	        List<Integer> list = Arrays.stream(arr)        // IntStream
	                                    .boxed()          // Stream<Integer>
	                                    .collect(Collectors.toList());
	 
	        System.out.println(list);
	    }
	}
