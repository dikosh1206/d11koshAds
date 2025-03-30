import java.util.Scanner;

public class Main {
    // Метод для вычисления факториала числа n с использованием рекурсии
    public static long factorial(int n) {
        if (n == 0 || n == 1) {  // Базовый случай
            return 1;
        }
        return n * factorial(n - 1);  // Рекурсивный вызов
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Включаем ввод с клавиатуры
        System.out.print("Введите число: ");
        int number = scanner.nextInt(); // Считываем число

        System.out.println("Факториал " + number + " = " + factorial(number)); // Выводим результат

        scanner.close(); // Закрываем Scanner
    }
}
