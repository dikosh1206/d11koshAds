import java.util.Scanner;

public class problem9 {
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) return 1;
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(binomialCoefficient(n, k));
    }
}

//To reverse a string, take its last character and put it at the beginning, then recursively reverse the rest. This process continues until all characters have been processed. The complexity of the algorithm is O(n), since it needs to go through the entire string.