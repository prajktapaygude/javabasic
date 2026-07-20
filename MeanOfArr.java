
package Array;

public class MeanOfArr {
    public static void main(String[] args) {
        int arr[] = {14, 5, 8, 1, 4, 7};

        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];  // Add each element to the sum
        }

        double mean = (double) sum / arr.length;  // Calculate the mean after the loop
        System.out.println("Mean is: " + mean);
    }
}
