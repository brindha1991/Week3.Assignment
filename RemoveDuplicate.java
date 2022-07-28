package Assignment2;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		String str = 
	            "We learn java basics as part of java sessions in java week1.";
	        
	        System.out.println("Original String: ");
	        System.out.println(str);
	        String[] strWords = str.split("\\s+");
	        
	        LinkedHashSet<String> SetWords = new LinkedHashSet<String>( Arrays.asList(strWords) );
	       
	        StringBuilder Java = new StringBuilder();
	        int index = 0;
	        
	        for(String s : SetWords){
	            
	            if(index > 0)
	                Java.append(" ");
	        
	            Java.append(s);
	            index++;
	        }
	        
	        str = Java.toString();
	        
	        System.out.println("String after removing duplicate words: ");
	        System.out.println(str);
	 
	    }
}