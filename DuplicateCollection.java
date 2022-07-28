package Assignment2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class DuplicateCollection {

		public static void main(String args[]) {
		      
		      String input = "we learn java basics as part of java seesions in java week1";
		      
		      input = input.toLowerCase(); 
		      
		      String[] strArray = input.split(" ");
		      
		      
		      List<String> listOfWords = Arrays.asList(strArray);
		      
		      
		      HashSet<String> uniqueWords = new HashSet<>(listOfWords);
		      
		      for(String word : uniqueWords)
		      {
		          if(Collections.frequency(listOfWords,word) > 1)
		        	  
		            System.out.print(" "+ word+" ");
		      }
		    }
		}