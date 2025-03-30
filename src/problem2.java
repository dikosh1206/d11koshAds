import java.util.Scanner;

public class problem2 {
    // Function to calculate the sum of array elements
    public static int sumArray(int[] arr, int index) {
        if (index == arr.length) {
            return 0; // Base case: the sum of an empty array is 0
        }
        return arr[index] + sumArray(arr, index + 1); // Recursion: summing up the elements
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println((double) sumArray(arr, 0) / n); // Finding the average
    }
}

//A prime number is a number that is divisible only by 1 and itself. To check if a number n is prime, we use a recursive function that checks if n is divisible by any number from 2 to sqrt(n). If n is divisible by at least one of these numbers, then it is composite, otherwise it is prime. This method works in O(√n), since we only check divisors up to the square root of the number.