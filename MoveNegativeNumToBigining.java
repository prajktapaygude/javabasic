package Array;

public class MoveNegativeNumToBigining {
    public static void main(String[] args) {
        int a[] = new int[] {1, -9, 7, -6, 4, 8, -1, -3};
        int len = a.length;
        int j = 0; // This will track the position to swap negative numbers to
        int temp;
        // Move negative numbers to the beginning
        for (int i = 0; i < len; i++) {
            if (a[i] < 0) { // Check if the current element is negative
                if (i != j) { // Check if we need to swap
                    // Swap elements
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                j++; // Move the position forward for the next negative number
            }
        }
        // Print the array
        for (int i = 0; i < len; i++) {
            System.out.print(a[i] + " ");
        }

}
}

/*
 * How j Works
Initialization:

j starts at 0. It indicates where the next negative number should be placed.
Processing Each Element:

The loop iterates through each element of the array.
Condition Check:

if (a[i] < 0) checks if the current element is negative.
Swapping Elements:

If i (current index) is not equal to j (current position for a negative number), it means the negative number at index i is not yet in the correct position.
Swap the elements at index i and j to move the negative number to the position j.
Incrementing j:

After placing a negative number at position j, increment j by 1. This updates j to point to the next position where another negative number should be placed.
 */
