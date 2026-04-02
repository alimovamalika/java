import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;

        do {
            System.out.print("Введите a: ");
            double a = sc.nextDouble();

            System.out.print("Введите b: ");
            double b = sc.nextDouble();

            System.out.print("Операция (+ - * /): ");
            char op = sc.next().charAt(0);

            double result = 0;

            switch (op) {
                case '+': result = a + b; break;
                case '-': result = a - b; break;
                case '*': result = a * b; break;
                case '/':
                    if (b != 0) result = a / b;
                    else System.out.println("Деление на 0!");
                    break;
            }

            System.out.println("Результат: " + result);

            System.out.print("Продолжить? (yes/no): ");
            choice = sc.next();

        } while (choice.equalsIgnoreCase("yes"));
    }
}