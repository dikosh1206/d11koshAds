import java.util.Scanner;

public class problem7 {
    public static void reversePrint(Scanner scanner, int n) {
        if (n == 0) return;
        int x = scanner.nextInt();
        reversePrint(scanner, n - 1);
        System.out.print(x + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        reversePrint(scanner, n);
    }
}

//A palindrome is a string that reads the same in both directions, such as radar. To check a string, compare its first and last characters. If they match, recursively check the rest of the string. If at least one pair of characters does not match, then the string is not a palindrome. This algorithm has O(n) complexity, since it needs to check all characters up to the middle of the string.