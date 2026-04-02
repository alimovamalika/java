import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите (например 2 + 3): ");
        double a = sc.nextDouble();
        String op = sc.next();
        double b = sc.nextDouble();

        switch (op) {
            case "+": System.out.println(a + b); break;
            case "-": System.out.println(a - b); break;
            case "*": System.out.println(a * b); break;
            case "/": System.out.println(a / b); break;
        }
    }
}