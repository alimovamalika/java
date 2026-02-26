import java.util.Scanner;

public class Lab6 {

    // =========================
    // ЗАДАНИЕ 1
    // =========================
    public static double rectangleArea(double width, double height) {
        return width * height;
    }

    // =========================
    // ЗАДАНИЕ 2
    // =========================
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // =========================
    // ЗАДАНИЕ 3 (перегрузка)
    // =========================
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static double max(double a, double b) {
        return (a > b) ? a : b;
    }

    // =========================
    // ЗАДАНИЕ 4 (рекурсия)
    // =========================
    public static long factorial(int n) {

        if (n < 0) {
            System.out.println("Факториал отрицательного числа не определён.");
            return -1;
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    // =========================
    // ЗАДАНИЕ 5 (рекурсия)
    // =========================
    public static long power(int base, int exponent) {

        if (exponent == 0) {
            return 1;
        }

        return base * power(base, exponent - 1);
    }

    // =========================
    // MAIN
    // =========================
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // -------- Задание 1 --------
        System.out.println("=== Задание 1 ===");
        System.out.print("Введите ширину: ");
        double width = scanner.nextDouble();
        System.out.print("Введите высоту: ");
        double height = scanner.nextDouble();

        double area = rectangleArea(width, height);
        System.out.println("Площадь прямоугольника: " + area);

        // -------- Задание 2 --------
        System.out.println("\n=== Задание 2 ===");
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        if (isEven(number)) {
            System.out.println("Число " + number + " является чётным.");
        } else {
            System.out.println("Число " + number + " является нечётным.");
        }

        // -------- Задание 3 --------
        System.out.println("\n=== Задание 3 ===");
        System.out.println("max(5, 9) = " + max(5, 9));
        System.out.println("max(4.7, 2.3) = " + max(4.7, 2.3));

        // -------- Задание 4 --------
        System.out.println("\n=== Задание 4 ===");
        System.out.print("Введите число для факториала: ");
        int factNumber = scanner.nextInt();

        long factResult = factorial(factNumber);
        if (factResult != -1) {
            System.out.println("Факториал числа " + factNumber + " равен: " + factResult);
        }

        // -------- Задание 5 --------
        System.out.println("\n=== Задание 5 ===");
        System.out.print("Введите основание: ");
        int base = scanner.nextInt();
        System.out.print("Введите степень: ");
        int exponent = scanner.nextInt();

        long powerResult = power(base, exponent);
        System.out.println(base + " в степени " + exponent + " = " + powerResult);

        scanner.close();
    }
}