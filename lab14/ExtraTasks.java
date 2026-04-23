import java.util.Scanner;
import java.util.Random;

public class ExtraTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Сумма от 1 до N
        System.out.println("Введите N:");
        int n = scanner.nextInt();
        int sum = 0, i = 1;
        do {
            sum += i;
            i++;
        } while (i <= n);
        System.out.println("Сумма: " + sum);

        // 2. Количество цифр
        System.out.println("Введите число:");
        int num = scanner.nextInt();
        int count = 0;
        do {
            num /= 10;
            count++;
        } while (num != 0);
        System.out.println("Количество цифр: " + count);

        // 3. Таблица умножения
        System.out.println("Введите число:");
        int m = scanner.nextInt();
        int j = 1;
        do {
            System.out.println(m + " * " + j + " = " + (m * j));
            j++;
        } while (j <= 10);

        // 4. Наибольшая цифра
        System.out.println("Введите число:");
        int number = scanner.nextInt();
        int max = 0;
        do {
            int digit = number % 10;
            if (digit > max) max = digit;
            number /= 10;
        } while (number > 0);
        System.out.println("Макс цифра: " + max);

        // 5. Палиндром
        System.out.println("Введите число:");
        int original = scanner.nextInt();
        int temp = original, reversed = 0;
        do {
            reversed = reversed * 10 + temp % 10;
            temp /= 10;
        } while (temp > 0);
        if (original == reversed)
            System.out.println("Палиндром");
        else
            System.out.println("Не палиндром");

        // 6. Чётные цифры
        System.out.println("Введите число:");
        int num2 = scanner.nextInt();
        int evenCount = 0;
        do {
            if ((num2 % 10) % 2 == 0) evenCount++;
            num2 /= 10;
        } while (num2 > 0);
        System.out.println("Чётных цифр: " + evenCount);

        // 7. Случайные числа до 0
        Random rand = new Random();
        int r;
        do {
            r = rand.nextInt(10);
            System.out.println(r);
        } while (r != 0);

        // 8. Сумма до 0
        int input, total = 0;
        do {
            System.out.println("Введите число (0 для выхода):");
            input = scanner.nextInt();
            total += input;
        } while (input != 0);
        System.out.println("Сумма: " + total);

        // 9. Проверка пароля (>=6)
        scanner.nextLine();
        String pass;
        do {
            System.out.println("Введите пароль (мин 6 символов):");
            pass = scanner.nextLine();
        } while (pass.length() < 6);
        System.out.println("Пароль принят");

        // 10. Минимальное число
        int min = Integer.MAX_VALUE;
        int val;
        do {
            System.out.println("Введите число (0 для выхода):");
            val = scanner.nextInt();
            if (val != 0 && val < min) min = val;
        } while (val != 0);
        System.out.println("Минимум: " + min);
    }
}