package Array;

public class FirstAndSecondLargestInArr {
	public static void main(String[] args) {
		
		int a[] = {12,54,5,6,78,93};
		int firstLargest = 0;
		int secondLargest = 0;
		
		for(int i = 0 ; i<a.length;i++)
		{
			if(firstLargest < a[i])	
			{
				secondLargest  = firstLargest;
				firstLargest  = a[i];	
			}
			else if(secondLargest < a[i])
			{
				secondLargest = a[i];
			}
		}
		System.out.println("first largest : "+firstLargest);
		System.out.println("second Largest : "+secondLargest);
		
	}

}
