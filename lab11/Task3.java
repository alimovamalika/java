import java.util.Scanner;

public class Task3 {

    public static double add(double a, double b) { return a + b; }
    public static double subtract(double a, double b) { return a - b; }
    public static double multiply(double a, double b) { return a * b; }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Ошибка: деление на ноль");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a: ");
        double a = sc.nextDouble();
        System.out.print("b: ");
        double b = sc.nextDouble();

        System.out.println("+: " + add(a, b));
        System.out.println("-: " + subtract(a, b));
        System.out.println("*: " + multiply(a, b));
        System.out.println("/: " + divide(a, b));
    }
}