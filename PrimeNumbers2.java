package NumberSeries;
//a prime number is only divisible by 1 and itself 
public class PrimeNumbers2 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) { // Start from 2, as 1 is not a prime number
            int count = 0;
            for (int j = 1; j <= i; j++) { // Check all divisors from 1 to i
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) { // Prime numbers have exactly 2 divisors
                System.out.print(i+" ");
            }
        }
    }
}
