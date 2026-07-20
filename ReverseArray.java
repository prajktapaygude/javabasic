package Array;
import java.util.Arrays;

// yat jr swapping chya addhi if (arr[i] > arr[j] condition takli
// jr array sort hotoy bubble sort ni . baki sagl same
public class ReverseArray {
	public static void main(String[] args) {
	
		int arr[] = new int[] {12,7,8,9,64,48,69};
		
		for(int i = 0 ; i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}		
		System.out.println();
		for(int i = 0 ; i<=arr.length-1; i++) {
			for(int j = i+1; j<=arr.length-1;j++)
			{
				
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
			}
		}
		
		System.out.println("array after reversing");
		for(int i = 0 ; i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
