package com.returnship.training;
import java.util.Scanner;

public class CharOccurance {
	
	public static void manin(String args[]) {
	
	Scanner sc = new Scanner(System.in);	
	
	System.out.println("Enter the string");
	String str = sc.nextLine().toLowerCase();
	String completed = "";
	
    for(int i=0;i<str.length();i++) {
        int count=0; 
        for(int j=i; j<str.length();j++) {
            if(str.charAt(i)==str.charAt(j)) {
                count++;   
            }
        }
        String s = String.valueOf(str.charAt(i));
        if(!completed.contains(s)){
            completed=completed+str.charAt(i);
            System.out.println("Total number of count of occurance of "+str.charAt(i)+" is "+count);
        }         
    }
}
}
