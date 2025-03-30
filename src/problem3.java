import java.util.Scanner;

public class problem3 {
    // Recursive function to check if a number is prime
    public static boolean isPrime(int n, int divisor) {
        if (n < 2) return false; //Numbers less than 2 are not prime
        if (divisor * divisor > n) return true; // If no divisors are found, the number is prime
        if (n % divisor == 0) return false; // If you find a divisor, the number is composite
        return isPrime(n, divisor + 1); // We check the next divisor
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(isPrime(n, 2) ? "Prime" : "Composite");
    }
}

//Fibonacci numbers form a sequence where each number is the sum of the previous two: 0, 1, 1, 2, 3, 5, 8, .... To calculate the n-th Fibonacci number, we use recursion: if n = 0, return 0, if n = 1, return 1, otherwise call the function for n - 1 and n - 2, adding their results. This method is inefficient, as it leads to an exponential number of calls O(2^n), since the same values ​​are recalculated many times.