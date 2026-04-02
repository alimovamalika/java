import java.util.*;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Введите число: ");
            int a = sc.nextInt();
            System.out.println("Вы ввели: " + a);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода!");
        }
    }
}