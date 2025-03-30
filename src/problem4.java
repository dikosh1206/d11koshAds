import java.util.Scanner;

public class problem4 {
    public static long factorial(int n) {
        if (n == 0) return 1; // Factorial 0 is 1
        return n * factorial(n - 1); // Recursion: n! = n * (n-1)!
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(factorial(n));
    }
}

//The greatest common divisor (GCD) of two numbers a and b is found using the Euclidean algorithm: if b = 0, then the GCD is a. Otherwise, we calculate gcd(b, a % b) until one of the numbers becomes 0. This is a recursive process that reduces a and b at each step, so the complexity of the algorithm is O(log(min(a, b))).