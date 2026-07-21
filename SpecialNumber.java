package NumberSeries;

// special Number : 1!+4!+5!=1+24+120=145

public class SpecialNumber {
	public static void main(String[] args) {
		
		int number = 145;
		int sum = 0;
		int reminder;
		int temp = number;
		
		while(temp != 0)
		{
			reminder = temp % 10 ; // shevat chi sankhaya ghene
			int fact = 1;
			
			for(int i = 1 ; i<=reminder;i++)
			{
				fact = fact * i;
			}
			
			sum = sum + fact;
			
			temp = temp/10; // shevat chi sankaya udavne 
		}
		if(sum == number)
		{
			System.out.println("number is special number");
		}
		else
		{
			System.out.println("number is not special number");
		}
	}

}
