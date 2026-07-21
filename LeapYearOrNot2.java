package NumberSeries;

/* 
 * conditions For leap year 
 * 1.  400 ni purn divisible asayla pahij
 *  OR
 * 2. 4 ni divide ni zale  pahij pan 100 ni divisible nako
 */
public class LeapYearOrNot2 {
	public static void main(String[] args) {
		int year = 2016;
		
		if (year % 4 == 0)
		{
					if(year % 100 == 0)
					{
									if(year % 400 == 0 )
									{
										System.out.println("leap year");
									}
									else
									{
										System.out.println("not leap year");
									}
					}else
					{
						System.out.println("leap year");
					}				
		}
		else
		{
			System.out.println("No Leap year");
		}
	}

}
