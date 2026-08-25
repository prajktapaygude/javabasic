package Array;

public class CommonEleOfTwoArr {
	
	public static void main(String[] args) {
		
		int a[]= new int[] {10,20,30,40,50};
		int b[] = new int[] {10,60,70,80,50,47};
		
		for(int i=0; i<a.length;i++)
		{
			for(int j = 0; j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
				}
			}
		}
	}

}
