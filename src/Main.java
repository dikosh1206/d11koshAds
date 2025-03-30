import java.util.Scanner;

public class Main {
    //Here we import Scanner, a class for working with input. Then we create a Main class, which contains main() and helper methods.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose a problem to run (1-10) or 0 to exit:");
            int choice = scanner.nextInt(); //This code snippet creates a Scanner object, which is used to read user input. It then starts an infinite loop, while (true), which allows the user to repeatedly select tasks.

            switch (choice) {
                case 1 -> problem1();
                case 2 -> problem2();
                case 3 -> problem3();
                case 4 -> problem4();
                case 5 -> problem5();
                case 6 -> problem6();
                case 7 -> problem7();
                case 8 -> problem8();
                case 9 -> problem9();
                case 10 -> problem10();
                case 0 -> {
                    System.out.println("Exiting program...");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
                //Here the switch statement determines which task to perform depending on the number entered. If the user enters 0, the program will terminate.
            }
        }
    }

    // Problem 1: Factorial (Recursion)
    public static void problem1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println("Factorial: " + factorial(n));
    }

    public static int factorial(int n) {
        return (n <= 1) ? 1 : n * factorial(n - 1);
    }

    // Problem 2: Bubble Sort
    public static void problem2() {
        int[] arr = {5, 2, 9, 1, 5, 6};
        bubbleSort(arr);
        System.out.println("Sorted array:");
        for (int num : arr) System.out.print(num + " ");
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Problem 3: Find Maximum in Array
    public static void problem3() {
        int[] arr = {10, 25, 17, 99, 4};
        System.out.println("Maximum value: " + findMax(arr));
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }

    // Problem 4: Check Palindrome
    public static void problem4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.next();
        System.out.println("Is palindrome: " + isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    // Problem 5: Fibonacci (Recursion)
    public static void problem5() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = scanner.nextInt();
        System.out.println("Fibonacci: " + fibonacci(n));
    }

    public static int fibonacci(int n) {
        return (n <= 1) ? n : fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Problem 6: Count Character Occurrences
    public static void problem6() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.next();
        System.out.print("Enter character to count: ");
        char ch = scanner.next().charAt(0);
        System.out.println("Occurrences: " + countChar(str, ch));
    }

    public static int countChar(String str, char ch) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == ch) count++;
        }
        return count;
    }

    // Problem 7: Reverse a String
    public static void problem7() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.next();
        System.out.println("Reversed: " + reverseString(str));
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Problem 8: Binary Search
    public static void problem8() {
        int[] arr = {1, 3, 5, 7, 9, 11};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number to search: ");
        int target = scanner.nextInt();
        System.out.println("Found at index: " + binarySearch(arr, target));
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    // Problem 9: Check Prime Number
    public static void problem9() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println("Is prime: " + isPrime(n));
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Problem 10: GCD using Euclidean Algorithm
    public static void problem10() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        System.out.println("GCD: " + gcd(a, b));
    }

    public static int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }
}
