public class Task1Sum {
    public static void main(String[] args) {
        int a = 3;
        int b = 7;
        int c = 10;

        int sum = a + b + c;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("Сумма = " + sum);
    }
}


public class Task2Arithmetic {
    public static void main(String[] args) {
        int x = 12;
        int y = 5;

        int sum = x + y;
        int product = x * y;
        double division = (double) x / y;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("Сложение: " + sum);
        System.out.println("Умножение: " + product);
        System.out.println("Деление: " + division);
    }
}


public class Task3Assignment {
    public static void main(String[] args) {
        int value = 10;

        System.out.println("Начальное значение: " + value);

        value = value + 5;
        System.out.println("После value = value + 5: " + value);

        value *= 2;
        System.out.println("После value *= 2: " + value);
    }
}


import java.util.Scanner;

public class Task4Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        int square = number * number;

        System.out.println("Квадрат числа: " + square);
    }
}


import java.util.Scanner;

public class Task5RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину: ");
        double length = scanner.nextDouble();

        System.out.print("Введите ширину: ");
        double width = scanner.nextDouble();

        double area = length * width;

        System.out.println("Площадь прямоугольника: " + area);
    }
}