package Array;

import java.util.Arrays;
import java.util.Random;

public class shaffleArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		Random rand = new Random();
		
		for(int i = 0 ; i<arr.length;i++)
		{
			int randomIndex = rand.nextInt(arr.length);
			int randomIndexToSwap = 0;
			int temp = arr[randomIndexToSwap];
			arr[randomIndexToSwap] = arr[i];
			arr[i]= temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
