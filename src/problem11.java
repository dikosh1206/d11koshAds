import java.util.Scanner;

public class problem11 {
    // Function to find minimum in array using recursion
    public static int findMin(int[] arr, int index) {
        // Base case: if the array consists of one element, it is the minimum
        if (index == arr.length - 1) {
            return arr[index];
        }
        // Recursively search for the minimum in the remaining part of the array
        return Math.min(arr[index], findMin(arr, index + 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Reading the array size
        int[] arr = new int[n];

        // Filling the array
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Call the recursive function and print the result
        System.out.println(findMin(arr, 0));
    }
}
//The factorial of a number n is the product of all the numbers from 1 to n. For example, 5! = 5 × 4 × 3 × 2 × 1 = 120. To calculate the factorial using recursion, we use the base case where n = 0 or n = 1, then we return 1. In other cases, we recursively multiply n by the result of calculating the factorial of n - 1. This results in O(n) function calls, since each new number requires calculating the factorial of the previous one.


