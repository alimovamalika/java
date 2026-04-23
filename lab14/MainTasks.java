import java.util.Scanner;

public class MainTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задача 1: Числа от 1 до 10
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);

        // Задача 2: Положительное число
        int number;
        do {
            System.out.println("Введите положительное число:");
            number = scanner.nextInt();
        } while (number <= 0);

        // Задача 3: Сумма цифр
        System.out.println("Введите число:");
        int num = scanner.nextInt();
        int sum = 0;
        do {
            sum += num % 10;
            num /= 10;
        } while (num > 0);
        System.out.println("Сумма цифр: " + sum);

        // Задача 4: Пароль
        scanner.nextLine();
        String password;
        String correct = "12345";
        do {
            System.out.println("Введите пароль:");
            password = scanner.nextLine();
        } while (!password.equals(correct));

        // Задача 5: Факториал
        System.out.println("Введите число:");
        int n = scanner.nextInt();
        int fact = 1;
        int j = 1;
        do {
            fact *= j;
            j++;
        } while (j <= n);
        System.out.println("Факториал: " + fact);

        // Задача 6: Continue/Stop
        scanner.nextLine();
        String choice;
        do {
            System.out.println("Работаем...");
            System.out.println("Продолжить? (yes/no)");
            choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("yes"));

        // Задача 7: Сумма двух чисел
        do {
            System.out.println("Введите a:");
            int a = scanner.nextInt();
            System.out.println("Введите b:");
            int b = scanner.nextInt();
            System.out.println("Сумма: " + (a + b));
            scanner.nextLine();
            System.out.println("Продолжить? (yes/no)");
            choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("yes"));

        // Задача 8: Сумма чётных чисел
        int evenSum = 0;
        int k = 2;
        do {
            evenSum += k;
            k += 2;
        } while (k <= 100);
        System.out.println("Сумма чётных: " + evenSum);
    }
}