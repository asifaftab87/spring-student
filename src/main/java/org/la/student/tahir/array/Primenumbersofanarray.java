package org.la.student.tahir.array;

public class Primenumbersofanarray {

	public static void main(String[] args) {
		//  wap to print all prime numbers from an array
		
		
		
		int[] array = new int [100];
	    
	    for(int i=0; i<100; i++)
	    {
	        array[i] = i+1;
	    }
	    //loop through the numbers one by one
	    for(int i=0; i<array.length; i++){
	        boolean isPrime = true;

	        //check to see if the numbers are prime
	        for (int j=2; j<i; j++){

	            if(i%j==0){
	                isPrime = false;
	                break;
	            }
	        }
	        //print the number
	        if(isPrime)

	            System.out.println(i + " are the prime numbers in the array ");
	    }
		
		
		
			}
			
				
		}
		
	




