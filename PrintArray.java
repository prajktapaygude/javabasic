package Array;

import java.util.Arrays;

public class PrintArray {

	public static void main(String[] args) {
		
		int a[] = new int[] {1,2,3,6,4};
		
		// Approch 1 
		String b = Arrays.toString(a);
		System.out.println(b);
		
		// Approch 2
		Arrays.stream(a).forEach(System.out:: println);
	}
}
