package Array;

public class MinAndMaxFromArr {

	public static void main(String[] args) {
		
		int a[] = { 12,58,4,13,96,78,54};
		int min = a[0];
		int max = a[0];
		
		for(int i = 0 ; i<=a.length-1; i++)
		{
			if(min > a[i])
			{
				min = a[i];
			}
			else if(max < a[i])
			{
				max = a[i];
			}
		}
		System.out.println("smallest number : "+ min+ " largest number : "+max);
	}
}
/*
Purpose: To find the smallest number in the array.
Condition: if (min > a[i])
This checks if the current element a[i] is smaller than the current min.
If a[i] is indeed smaller than min, then a[i] becomes the new smallest number.
Action: min = a[i];
Updates min to the value of a[i] because a[i] is smaller than the previous min.
How It Works:

Initial State: min starts with the first element of the array.
During Iteration:
The condition is checked for each element.
If an element smaller than the current min is found, min is updated.
Result: By the end of the loop, min holds the smallest value found in the array.*/