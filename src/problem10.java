import java.util.Scanner;

public class problem10 {
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(gcd(a, b));
    }
}


//To find the minimum element of an array, compare its first element with the minimum value in the rest of the array. If the array consists of one element, it is the minimum. The algorithm calls the function n times (where n is the size of the array), so its complexity is O(n).