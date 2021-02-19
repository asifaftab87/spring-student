package org.la.student.sadique;

public class CheekNumberIsPerfectOrNot {

		public static void main(String[] args) {
			// TODO Auto-generated method stub.
			 int num = 6 , sum = 0 , i;
		        for( i = 1; i < num; i++)
		        {
		            if(num % i == 0)
		            {
		                sum = sum + i;
		            }
		        }
		        if(sum == num)
		        {
		            System.out.println("Given number is Perfect: "+i);
		        }
		        else
		        {
		            System.out.println("Given number is not Perfect: "+i);
		        }

	}

}
