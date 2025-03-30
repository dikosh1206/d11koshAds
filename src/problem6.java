import java.util.Scanner;

public class problem6 {
    public static int power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(power(a, n));
    }
}

//To calculate a^b (a raised to the b power), we use recursion. If b = 0, we return 1, since any number raised to the zero power is 1. Otherwise, we multiply a by the result of power(a, b-1). This algorithm runs in O(b), but it can be optimized to O(log b) using the fast exponentiation method: if b is even, then a^b = (a^(b/2))^2, and if b is odd, then a^b = a × a^(b-1).