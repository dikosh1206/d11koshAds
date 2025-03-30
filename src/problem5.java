import java.util.Scanner;

public class problem5 {
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2); // Sum of the previous tw
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fibonacci(n));
    }
}

//Binary search is used to quickly find a number x in a sorted array. First, we check the middle element of the array. If x is smaller than it, we continue searching in the left half, if it is larger, in the right half. Thus, at each step, the array size is halved, and the total number of steps is O(log n). This method is significantly faster than linear search O(n), especially for large arrays.