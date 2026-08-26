package Array;
// only applicable for sorted array 
public class RemoveDuplicateFromArr {
	public static void main(String[] args) {
		int[] arr = new int[] {2,4,5,5,5,7,9,9,10,10};
		int j = 0;
		for(int i = 0 ; i<arr.length-1; i++)
		{//Condition: if(arr[i] != arr[i+1]) checks if the current element is different from the next element. This works because the array is sorted.
			//Action: If the condition is true, it means arr[i] is a unique element and should be placed at index j of the array. After placing it, j is incremented.
			if(arr[i] != arr[i+1])
			{
				arr[j]= arr[i];
				j++;
			}
		}
		arr[j]=arr[arr.length-1];
		//(arr[arr.length - 1]) because the last element needs to be included in the result as it might be unique.
		
		//This loop prints the unique elements of the array. j + 1 is used as the boundary because j is the index of the last unique element.
		for(int i =0; i<j+1;i++)
		{
			System.out.print(arr[i]+"    ");
		}
	}
}
