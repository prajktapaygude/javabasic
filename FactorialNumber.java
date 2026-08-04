package NumberSeries;

// factorial Number = 5 = 5*4*3*2*1=120

public class FactorialNumber {
	public static void main(String[] args) {
		
		int number = 5;
		int fact = 1 ;
		
		for(int i=1 ; i<= 5 ; i++ )
		{
			fact = fact * i;
		}
		System.out.println("factorial is : "+fact);
	}

}
