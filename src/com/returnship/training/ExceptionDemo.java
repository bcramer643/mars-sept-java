package com.returnship.training.exception;

import java.util.Scanner;
import java.lang.Exception;

public class ExceptionDemo {

	public static void main (String[] args) {

		  try{
			  
			  Scanner scan = new Scanner(System.in);
		   System.out.println("Enter 10 numbers withing the range of 5 to 50:");
		   int[] num = new int[10];
		   for(int i=0;i<10;i++){
			  num[i] = scan.nextInt();


		 if (num[i] <0 ) 
		 {
			  throw new NegativeNumberException("Number cannot be negative");
	     }

		 if (num[i] >50 ) 
		 {
			  throw new NumberGreaterException("Number must be less than 100");
	     }

		 if (num[i]< 5) 
		 {
			  throw new NumberLesserException("Number must be greater than than 5");
	     }


		   }
		   }

			  catch(NegativeNumberException | NumberGreaterException|NumberLesserException e) {
				  if(e instanceof NegativeNumberException) {
					  System.out.println(e.getMessage());}
					  else if (e instanceof NumberGreaterException) 
						  System.out.println(e.getMessage()); 
						  else if (e instanceof NumberLesserException) {
							  System.out.println(e.getMessage());
					  }
			   }
			  }
}
