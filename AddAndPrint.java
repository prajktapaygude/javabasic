package Loops;

import java.util.Scanner;

public class AddAndPrint {

	public static void main(String[] args) {
		int  range,sum= 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Range =");
		
		range = sc.nextInt();
		
		int i;
		for(i = 1;i<=range; i++)
		{
			sum = i+sum*2;
			if(i==range)
				System.out.print(i);
			else
				System.out.print(i+ "+" );
		}
		System.out.println("\n \n sun of series is " +sum);
		sc.close();

		
		

	}

}
