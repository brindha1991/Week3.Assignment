package Assignment2;

import java.util.Arrays;

public class Missingelement {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		int length = arr.length+1;
		int sum=length*(length+ 1)/2;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
		}
for (int i = 0; i < arr.length; i++) {
	sum=sum -arr[i];
	
	
}
System.out.println("The missing element is = "+sum);
	}

}
