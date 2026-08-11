package Array;

import java.util.Arrays;

public class ReverseArrayElements {
	public static void main(String[] args) {
		
		int array[] = new int[] {1,2,3,4,5};
		System.out.println(Arrays.toString(array));
		int start = 0;
		int end = array.length-1;
		
		while(start < end)
		{
			int temp = array[start];
			array[start] = array[end];
			array[end]= temp;
			
			start++;
			end--;	
		}
		
		for(int reverseArray : array)
		{
			System.out.print(reverseArray+"  ");
		}
	}

}
