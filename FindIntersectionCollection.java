package Assignment2;

import java.util.HashSet;

public class FindIntersectionCollection {

	public static void main(String[] args) {
		HashSet <String> set1 = new HashSet <String>();
	      HashSet <String> set2 = new HashSet <String>();
	      set1.add("3");
	      set1.add("2");
	      set1.add("11");
	      set1.add("4");
	      set1.add("6");
	      set1.add("7");
	      
	      System.out.println("Set1 = "+ set1);
	      set2.add("1");
	      set2.add("2");
	      set2.add("8");
	      set2.add("4");
	      set2.add("9");
	      set2.add("7");
	      System.out.println("Set2 = "+ set2);
	      set1.retainAll(set2);
	      System.out.println("Intersection = "+ set1);
	   }
	}
