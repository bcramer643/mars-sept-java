package com.returnship.training;
import java.util.Scanner;

public class CourseAvailability {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in); 
    System.out.println("Enter the Number of Courses "); 
     int  arr_size = sc.nextInt(); 
     
     String [] arr = new String [arr_size];
    
     System.out.println( "Enter the Courses here: "); 
     for (int i = 0; i < arr_size; i++) { 
   	 arr[i] = sc.nextLine();  
    } 
    System.out.print( "The Courses are: ");
    for (int i = 0; i < arr_size; i++) { 
        System.out.print(arr[i] + " ");
        } 
    System.out.println("\n");
    System.out.println( "Enter the course to Search ");
    String searchCourse = sc.nextLine();
    for (int i = 0; i < arr.length; i++) {
   	   if (arr [i].equals(searchCourse)) {
   		   System.out.println("Course is Available" );	    		    		   
   		 } 
   	   else {
   		   System.out.println("Course is  Not Available" ); 
   	   }		
	}
 }
	
	
	
}
