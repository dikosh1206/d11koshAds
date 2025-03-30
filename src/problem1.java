import java.util.Scanner;

public class problem1 {
    // Функция для поиска минимума в массиве с использованием рекурсии
    public static int findMin(int[] arr, int index) {
        // Базовый случай: если массив состоит из одного элемента, он и есть минимум
        if (index == arr.length - 1) {
            return arr[index];
        }
        // Рекурсивно ищем минимум в оставшейся части массива
        return Math.min(arr[index], findMin(arr, index + 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Читаем размер массива
        int[] arr = new int[n];

        // Заполняем массив
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Вызываем рекурсивную функцию и выводим результат
        System.out.println(findMin(arr, 0));
    }
}
