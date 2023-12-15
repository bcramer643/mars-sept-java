package com.returnship.training;
import java.util.Scanner;

public class EvenNumber {
	
	public static void main(String[] args)   
	{  
		
		int n;
		Scanner sc = new Scanner(System.in);  
		System.out.print("ENTER THE SIZE OF ARRAY: ");  
		n=sc.nextInt();  
		int[] array = new int[n];  
		
	
		System.out.println("ENTER ELEMENTS OF ARRAY: ");  
		for(int i=0; i<n; i++){  
			array[i]=sc.nextInt();  
		}  
		
	
	    for (int i = 0; i <n; i++) {
	    	
	        if (array[i] % 2 == 0) {
	        	System.out.println("EVEN NUMBER FOUND"+array[i]); 
	        }	          
	        
	    }
	    
	}

}
