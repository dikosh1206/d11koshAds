import java.util.Scanner;

public class problem8 {
    public static boolean isAllDigits(String s, int index) {
        if (index == s.length()) return true;
        if (!Character.isDigit(s.charAt(index))) return false;
        return isAllDigits(s, index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(isAllDigits(s, 0) ? "Yes" : "No");
    }
}

//To find the sum of the digits of a number n, we separate the last digit n % 10 and add it to the sum of the remaining digits sum(n // 10). The recursion continues until the number becomes 0. Since each decrease of n by one digit requires one function call, the complexity of the algorithm is O(log n), since the number contains log n digits.