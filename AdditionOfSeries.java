package Loops;
import java.util.*;
public class AdditionOfSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0,range;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a range =");
		
		range= sc.nextInt();
		int i;
		for(i = 1;i<=range; i++)
		{
			sum = i+sum*2;
			if(i==range)
				System.out.print(i);
			else
				System.out.print(i+ "+");
		}
		System.out.println("\n \n sun of series is " +sum);
		sc.close();

	}

}
