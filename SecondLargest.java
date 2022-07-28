package Assignment2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SecondLargest {
	
	public static void main(String args[]){  
		Integer arr[]={1,2,3,4,7,6,8}; 
		List<Integer> list=Arrays.asList(arr);  
		Collections.sort(list);  
		int element=list.get(arr.length-2);   
		System.out.println("Second Largest: "+ element);  
	}
}  