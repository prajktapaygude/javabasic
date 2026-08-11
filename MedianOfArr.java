package Array;

import java.util.Arrays;

public class MedianOfArr {
	public static void main(String[] args) {		
		int arr[] = {8,3,9,4,2,1};
		System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
		System.out.print(Arrays.toString(arr));
		System.out.println();
		int n = arr.length;
		double median=0;     
		if(n % 2 != 0)
		{
			median = arr[n/2];
		}
		else
		{
            median = (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
		}
		System.out.println("median is  "+median);
	}

}

/*
 * Finding the middle elements:
In an array of even length, the two middle elements are at the positions:

Middle element 1: At index n / 2 - 1 (or equivalently (n - 1) / 2).
Middle element 2: At index n / 2.
For example, if n = 6:

n / 2 = 3, so the second middle element is at index 3 (arr[3]).
(n - 1) / 2 = 2, so the first middle element is at index 2 (arr[2]).
*/
