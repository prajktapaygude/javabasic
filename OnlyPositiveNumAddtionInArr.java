package Array;

public class OnlyPositiveNumAddtionInArr {
	
	public static void main(String[] args) {
		
		int a[]= {12,-89,63,-45,4,-71};
		int sum = 0;
		
		for( int i = 0 ; i<= a.length-1; i++)
		{
			if(a[i] > 0)
			{
				sum = sum + a[i];
			}
		}
		System.out.println("sum of positive integer is : "+sum);
	}

}
